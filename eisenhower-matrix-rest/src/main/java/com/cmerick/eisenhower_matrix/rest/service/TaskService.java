package com.cmerick.eisenhower_matrix.rest.service;

import com.cmerick.eisenhower_matrix.rest.dto.task.TaskResponse;
import com.cmerick.eisenhower_matrix.rest.dto.task.TaskSearchRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {
    public TaskResponse findAll(TaskSearchRequestDto filter) {
        return TaskResponse.builder().build();
    }
}
