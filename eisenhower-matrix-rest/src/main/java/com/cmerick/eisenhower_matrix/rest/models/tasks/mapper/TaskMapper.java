package com.cmerick.eisenhower_matrix.rest.models.tasks.mapper;

import com.cmerick.eisenhower_matrix.rest.dtos.task.TaskResponseDto;
import com.cmerick.eisenhower_matrix.rest.models.tasks.entity.Task;
import org.modelmapper.ModelMapper;

import java.util.Collection;
import java.util.Collections;

public class TaskMapper {

    private ModelMapper modelMapper;

    public TaskResponseDto map(Task entityToMap) {
        return modelMapper.map(entityToMap, TaskResponseDto.class);
    }

    public Collection<TaskResponseDto> map(Collection<Task> entitiesToMap) {
        if (null == entitiesToMap) {
            return Collections.emptyList();
        }
        return entitiesToMap.stream().map(this::map).toList();
    }
}
