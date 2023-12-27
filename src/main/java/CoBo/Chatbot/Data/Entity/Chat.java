package CoBo.Chatbot.Data.Entity;

import CoBo.Chatbot.Data.Entity.Embedded.UserId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Chat {

    @EmbeddedId
    private UserId userId;

    @Column(length = 500)
    private String question;

    @Column(length = 500)
    private String answer;

    @Builder
    public Chat(UserId userId, String question, String answer){
        this.userId = userId;
        this.question = question;
        this.answer = answer;
    }
}
