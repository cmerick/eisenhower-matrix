package com.cmerick.eisenhower_matrix.rest.service;

import com.cmerick.eisenhower_matrix.rest.dto.exception.BadRequestException;
import com.cmerick.eisenhower_matrix.rest.dto.exception.NotFoundException;
import com.cmerick.eisenhower_matrix.rest.dto.task.TaskRegisterRequestDto;
import com.cmerick.eisenhower_matrix.rest.dto.task.TaskResponse;
import com.cmerick.eisenhower_matrix.rest.dto.task.TaskSearchRequestDto;
import com.cmerick.eisenhower_matrix.rest.enums.SimpleStatusEnum;
import com.cmerick.eisenhower_matrix.rest.models.tasks.entity.Task;
import com.cmerick.eisenhower_matrix.rest.models.tasks.mapper.TaskMapper;
import com.cmerick.eisenhower_matrix.rest.models.users.entity.User;
import com.cmerick.eisenhower_matrix.rest.repository.TaskRepository;
import com.cmerick.eisenhower_matrix.rest.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TaskService {

    @Autowired
    TaskRepository repository;

    @Autowired
    UserRepository userRepository;

    TaskMapper mapper;

    @Transactional(rollbackOn = Throwable.class)
    public void create(TaskRegisterRequestDto requestEntity) {
        Optional<User> user = this.userRepository.findById(requestEntity.getUserId());

        user.ifPresent(value -> this.repository.save(Task.builder()
                .userId(requestEntity.getUserId())
                .title(requestEntity.getTitle())
                .taskNumber(value.getTaskSequence() != null ? value.getTaskSequence() + 1 : 1)
                .description(requestEntity.getDescription())
                .dueDate(requestEntity.getDueDate())
                .urgency(requestEntity.getUrgency())
                .importance(requestEntity.getImportance())
                .status(SimpleStatusEnum.ACTIVE)
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
                .urgency(requestEntity.getUrgency())
                .importance(requestEntity.getImportance())
                .status(value.getStatus())
                .build()));
    }

    public Collection<TaskResponse> findAll(TaskSearchRequestDto filter) {
        Collection<Task> entities = new ArrayList<>();

        return this.mapper.map(entities);
    }

    public Optional<Task> findById(UUID id) {
        return repository.findById(id);
    }

    public TaskResponse getById(UUID id)  {
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
