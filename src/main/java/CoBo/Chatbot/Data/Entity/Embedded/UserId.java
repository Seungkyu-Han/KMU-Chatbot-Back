package CoBo.Chatbot.Data.Entity.Embedded;

import CoBo.Chatbot.Data.Entity.User;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
@NoArgsConstructor
@Data
public class UserId implements Serializable {

    @ManyToOne
    private User user;

    private LocalDateTime createdAt;

    @Builder
    public UserId(User user, LocalDateTime createdAt){
        this.user = user;
        this.createdAt = createdAt;
    }
}
