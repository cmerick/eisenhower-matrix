package com.cmerick.eisenhower_matrix.rest.models.tasks.entity;

import com.cmerick.eisenhower_matrix.rest.enums.SimpleBooleanEnum;
import com.cmerick.eisenhower_matrix.rest.enums.SimpleStatusEnum;
import com.cmerick.eisenhower_matrix.rest.models.users.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tb_tasks")
public class Task implements Serializable {

    @Serial
    private static final long serialVersionUID = 6826360975836308784L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "user_id", nullable = false)
    private UUID userId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "task_number", nullable = false)
    private Integer taskNumber;

    @Column(name = "description")
    private String description;

    @Column(name = "due_date")
    private Date dueDate;

    @Column(name = "urgency", nullable = false)
    private boolean urgency;

    @Column(name = "importance", nullable = false)
    private boolean importance;

    @Column(name = "status", nullable = false)
    private SimpleStatusEnum status;

    @Column(name = "created_at", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdAt;
}
