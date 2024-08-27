package com.cmerick.eisenhower_matrix.rest.repositories;

import com.cmerick.eisenhower_matrix.rest.models.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID>, JpaSpecificationExecutor<User> {

    UserDetails findByUserName(String userName);

}
