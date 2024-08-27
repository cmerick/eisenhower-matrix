package com.cmerick.eisenhower_matrix.rest.models.users.mapper;

import com.cmerick.eisenhower_matrix.rest.dtos.user.UserResponseDto;
import com.cmerick.eisenhower_matrix.rest.models.users.entity.User;
import org.modelmapper.ModelMapper;

import java.util.Collection;
import java.util.Collections;

public class UserMapper {
    private ModelMapper modelMapper;

    public UserResponseDto map(User entityToMap) {
        return modelMapper.map(entityToMap, UserResponseDto.class);
    }

    public Collection<UserResponseDto> map(Collection<User> entitiesToMap) {
        if (null == entitiesToMap) {
            return Collections.emptyList();
        }
        return entitiesToMap.stream().map(this::map).toList();
    }
}
