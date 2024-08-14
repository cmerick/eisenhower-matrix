package com.cmerick.eisenhower_matrix.rest.controller;

import com.cmerick.eisenhower_matrix.rest.dto.task.TaskRegisterRequestDto;
import com.cmerick.eisenhower_matrix.rest.dto.task.TaskResponse;
import com.cmerick.eisenhower_matrix.rest.dto.task.TaskSearchRequestDto;
import com.cmerick.eisenhower_matrix.rest.models.tasks.entity.Task;
import com.cmerick.eisenhower_matrix.rest.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("task")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService service;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody TaskRegisterRequestDto requestEntity) {
        this.service.create(requestEntity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Void> update(@PathVariable("id") UUID id, @RequestBody TaskRegisterRequestDto requestEntity) {
        this.service.update(id, requestEntity);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("all")
    public ResponseEntity<Collection<TaskResponse>> findAll(TaskSearchRequestDto requestEntity) {
        return ResponseEntity.ok(this.service.findAll(requestEntity));
    }

    @GetMapping("{id}")
    public ResponseEntity<TaskResponse> getById(@PathVariable("id") UUID id) {
        return ResponseEntity.ok(this.service.getById(id));
    }

    @PutMapping("{id}/active")
    public ResponseEntity<Void> active(@PathVariable("id") UUID id) {
        this.service.activeById(id);
        return ResponseEntity.accepted().build();
    }

    @DeleteMapping("{id}/inactive")
    public ResponseEntity<Void> inactive(@PathVariable("id") UUID id) {
        this.service.inactiveById(id);
        return ResponseEntity.accepted().build();
    }

}
