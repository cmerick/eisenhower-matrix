package br.com.mar.textpulse.dto.notification;

import br.com.mar.textpulse.dto.notification.enums.NotificationStatusEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NotificationUpdateRequest {

    @JsonProperty("status")
    private NotificationStatusEnum status;

    @JsonProperty("sentDate")
    private LocalDateTime sentDate;

}
