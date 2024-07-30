package br.com.mar.textpulse.dto.notification;

import br.com.mar.textpulse.dto.notification.enums.NotificationStatusEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NotificationSearchRequest {

    @JsonProperty("status")
    private NotificationStatusEnum status;

}
