package com.cmerick.eisenhower_matrix.rest.models.tasks.entity;

import com.cmerick.eisenhower_matrix.rest.models.users.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
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
    @GeneratedValue
    @Column(name = "task_id", updatable = false, nullable = false)
    private UUID taskId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "task_number", nullable = false)
    private Integer taskNumber;

    @Column(name = "description")
    private String description;

    @Column(name = "due_date")
    private Date dueDate;

    @Column(name = "urgency", nullable = false)
    private Integer urgency;

    @Column(name = "importance", nullable = false)
    private Integer importance;

    @Column(name = "created_at", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();
}
