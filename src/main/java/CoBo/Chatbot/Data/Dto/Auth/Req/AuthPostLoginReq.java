package CoBo.Chatbot.Data.Dto.Auth.Req;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AuthPostLoginReq {

    @NotBlank
    private String email;

    @NotBlank
    private String password;
}
