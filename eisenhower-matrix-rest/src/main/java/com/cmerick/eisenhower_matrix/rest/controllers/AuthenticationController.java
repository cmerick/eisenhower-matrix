package com.cmerick.eisenhower_matrix.rest.controllers;

import com.cmerick.eisenhower_matrix.rest.configurations.security.TokenService;
import com.cmerick.eisenhower_matrix.rest.dtos.authentication.AuthenticationRequestDto;
import com.cmerick.eisenhower_matrix.rest.dtos.authentication.AuthenticationResponseDto;
import com.cmerick.eisenhower_matrix.rest.dtos.user.UserRegisterDto;
import com.cmerick.eisenhower_matrix.rest.models.users.entity.User;
import com.cmerick.eisenhower_matrix.rest.repositories.UserRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository repository;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody AuthenticationRequestDto requestEntity){
        var userNamePassword = new UsernamePasswordAuthenticationToken(requestEntity.getUserName(), requestEntity.getPassword());

        var auth = this.authenticationManager.authenticate(userNamePassword);

        var token = tokenService.generateToken((User) auth.getPrincipal());

        return ResponseEntity.ok(AuthenticationResponseDto.builder().token(token).build());
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody UserRegisterDto requestEntity) {
        if(this.repository.findByUserName(requestEntity.getUserName()) != null) return ResponseEntity.badRequest().build();

        String encryptedPassword = new BCryptPasswordEncoder().encode(requestEntity.getPassword());

        User newUser = User.builder()
                .userName(requestEntity.getUserName())
                .password(encryptedPassword)
                .role(requestEntity.getRole())
                .build();

        this.repository.save(newUser);

        return ResponseEntity.ok().build();
    }
}
