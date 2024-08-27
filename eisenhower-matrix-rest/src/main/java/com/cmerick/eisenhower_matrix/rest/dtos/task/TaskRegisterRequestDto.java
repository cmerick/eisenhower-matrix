package com.cmerick.eisenhower_matrix.rest.dtos.task;

import com.cmerick.eisenhower_matrix.rest.enums.SimpleBooleanEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    private boolean urgency;

    @JsonProperty("importance")
    private boolean importance;
}
