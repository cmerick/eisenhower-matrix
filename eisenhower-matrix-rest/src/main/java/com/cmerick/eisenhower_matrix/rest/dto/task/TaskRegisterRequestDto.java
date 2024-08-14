package com.cmerick.eisenhower_matrix.rest.dto.task;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
@Builder
public class TaskRegisterRequestDto {
    @JsonProperty("userId")
    private UUID userId;

    @JsonProperty("title")
    private String title;

    @JsonProperty("taskNumber")
    private Integer taskNumber;

    @JsonProperty("description")
    private String description;

    @JsonProperty("dueDate")
    private Date dueDate;

    @JsonProperty("urgency")
    private Integer urgency;

    @JsonProperty("importance")
    private Integer importance;
}
