package CoBo.Chatbot.Data.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class User {

    @Id
    private Integer id;

    @Column(length = 20)
    private String email;

    private String password;

    private String refreshToken;

    @Builder
    public User(Integer id, String email, String password, String refreshToken){
        this.id = id;
        this.email = email;
        this.password = password;
        this.refreshToken = refreshToken;
    }
}
