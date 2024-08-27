package com.cmerick.eisenhower_matrix.rest.services;

import com.cmerick.eisenhower_matrix.rest.dtos.exception.BadRequestException;
import com.cmerick.eisenhower_matrix.rest.dtos.exception.NotFoundException;
import com.cmerick.eisenhower_matrix.rest.dtos.task.TaskRegisterRequestDto;
import com.cmerick.eisenhower_matrix.rest.dtos.task.TaskResponseDto;
import com.cmerick.eisenhower_matrix.rest.dtos.task.TaskSearchRequestDto;
import com.cmerick.eisenhower_matrix.rest.enums.SimpleStatusEnum;
import com.cmerick.eisenhower_matrix.rest.models.tasks.entity.Task;
import com.cmerick.eisenhower_matrix.rest.models.tasks.mapper.TaskMapper;
import com.cmerick.eisenhower_matrix.rest.models.users.entity.User;
import com.cmerick.eisenhower_matrix.rest.repositories.TaskRepository;
import com.cmerick.eisenhower_matrix.rest.repositories.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
@RequiredArgsConstructor
public class TaskService extends CommonBaseService {

    @Autowired
    TaskRepository repository;

    @Autowired
    UserRepository userRepository;

    TaskMapper mapper;

    @Transactional(rollbackOn = Throwable.class)
    public void create(TaskRegisterRequestDto requestEntity)  {
        Optional<User> user = this.userRepository.findById(requestEntity.getUserId());

        user.ifPresent(value -> this.repository.save(Task.builder()
                .userId(requestEntity.getUserId())
                .title(requestEntity.getTitle())
                .taskNumber(value.getTaskSequence() != null ? value.getTaskSequence() + 1 : 1)
                .description(requestEntity.getDescription())
                .dueDate(requestEntity.getDueDate())
                .urgency(requestEntity.isUrgency())
                .importance(requestEntity.isImportance())
                .status(SimpleStatusEnum.ACTIVE)
                .createdAt(LocalDateTime.now())
                .build()));
    }

    @Transactional(rollbackOn = Throwable.class)
    public void update(UUID id, TaskRegisterRequestDto requestEntity) {
        Optional<Task> task = this.repository.findById(id);

        task.ifPresent(value -> this.repository.save(Task.builder()
                .id(id)
                .userId(requestEntity.getUserId())
                .title(requestEntity.getTitle())
                .taskNumber(value.getTaskNumber())
                .description(requestEntity.getDescription())
                .dueDate(requestEntity.getDueDate())
                .urgency(requestEntity.isUrgency())
                .importance(requestEntity.isImportance())
                .status(value.getStatus())
                .build()));
    }

    public Collection<TaskResponseDto> findAll(TaskSearchRequestDto filter) {

        String queryStr = "SELECT * FROM tb_tasks";

        Collection<Map<String, Object>> rows = getJdbcTemplate().queryForList(queryStr);

        Collection<TaskResponseDto> entities = new ArrayList<>();

        for (Map<String, Object> row : rows) {
            var entity = TaskResponseDto.builder()
                    .id((UUID) row.get("id"))
                    .userId((UUID) row.get("user_id"))
                    .title((String) row.get("title"))
                    .taskNumber((Integer) row.get("task_number"))
                    .description((String) row.get("description"))
                    .dueDate((Date) row.get("due_date"))
                    .urgency((boolean) row.get("urgency"))
                    .importance((boolean) row.get("importance"))
                    .status((SimpleStatusEnum) row.get("status"))
                    .createdAt( (Date) row.get("created_at"))
                    .build();

            entities.add(entity);
        }
        return entities;
    }

    public Optional<Task> findById(UUID id) {
        return repository.findById(id);
    }

    public TaskResponseDto getById(UUID id)  {
        Task entity = this.findById(id).orElseThrow(NotFoundException::new);

        return this.mapper.map(entity);
    }

    @Transactional(rollbackOn = Throwable.class)
    public void activeById(UUID id) {
        var entity = this.findById(id).orElseThrow(NotFoundException::new);

        if (entity.getStatus().equals(SimpleStatusEnum.ACTIVE)) {
            throw new BadRequestException("Task já está ativa");
        }

        entity.setStatus(SimpleStatusEnum.ACTIVE);

        this.repository.save(entity);
    }

    @Transactional(rollbackOn = Throwable.class)
    public void inactiveById(UUID id) {
        var entity = this.findById(id).orElseThrow(NotFoundException::new);

        if (entity.getStatus().equals(SimpleStatusEnum.INACTIVE)) {
            throw new BadRequestException("Task já está inativa");
        }

        entity.setStatus(SimpleStatusEnum.INACTIVE);

        this.repository.save(entity);
    }

}
