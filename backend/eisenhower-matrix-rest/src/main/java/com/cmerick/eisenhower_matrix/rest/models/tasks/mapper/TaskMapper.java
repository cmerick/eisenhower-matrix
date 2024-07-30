package com.cmerick.eisenhower_matrix.rest.models.tasks.mapper;

import org.modelmapper.ModelMapper;

import java.util.Collection;
import java.util.Collections;

public class TaskMapper {

    private final ModelMapper modelMapper;

    public CampoResponse map(Campo entityToMap) {
        return modelMapper.map(entityToMap, CampoResponse.class);
    }

    public Collection<CampoResponse> map(Collection<Campo> entitiesToMap) {
        if (null == entitiesToMap) {
            return Collections.emptyList();
        }
        return entitiesToMap.stream().map(this::map).toList();
    }
}
