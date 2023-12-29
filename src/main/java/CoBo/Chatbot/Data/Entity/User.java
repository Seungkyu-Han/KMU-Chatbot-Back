package CoBo.Chatbot.Data.Entity;

import CoBo.Chatbot.Data.Enum.RoleEnum;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class User {

    @Id
    private Integer studentId;

    @Column(length = 5)
    private String name;

    private String email;

    private Integer kakaoId;

    @Enumerated(EnumType.ORDINAL)
    private RoleEnum role;

    private String accessToken;

    @Builder
    public User(Integer studentId, String name, String email, Integer kakaoId, RoleEnum role, String accessToken){
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.kakaoId = kakaoId;
        this.role = role;
        this.accessToken = accessToken;
    }
}
