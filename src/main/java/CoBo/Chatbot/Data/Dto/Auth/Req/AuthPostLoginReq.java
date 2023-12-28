package CoBo.Chatbot.Data.Dto.Auth.Req;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AuthPostLoginReq {

    @NotBlank
    @Schema(description = "이메일", example = "jhpmuscle@gmail.com")
    private String email;

    @NotBlank
    @Schema(description = "비밀번호", example = "1234")
    private String password;
}
