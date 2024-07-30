package com.cmerick.eisenhower_matrix.rest.repository;

import com.cmerick.eisenhower_matrix.rest.models.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID>, JpaSpecificationExecutor<User> {
}
