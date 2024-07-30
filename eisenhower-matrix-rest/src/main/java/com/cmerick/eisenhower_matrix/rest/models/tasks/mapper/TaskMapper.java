package com.cmerick.eisenhower_matrix.rest.models.tasks.mapper;

import com.cmerick.eisenhower_matrix.rest.dto.task.TaskResponse;
import com.cmerick.eisenhower_matrix.rest.models.tasks.entity.Task;
import org.modelmapper.ModelMapper;

import java.util.Collection;
import java.util.Collections;

public class TaskMapper {

    private ModelMapper modelMapper;

    public TaskResponse map(Task entityToMap) {
        return modelMapper.map(entityToMap, TaskResponse.class);
    }

    public Collection<TaskResponse> map(Collection<Task> entitiesToMap) {
        if (null == entitiesToMap) {
            return Collections.emptyList();
        }
        return entitiesToMap.stream().map(this::map).toList();
    }
}
