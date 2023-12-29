package CoBo.Chatbot.Data.Dto.Auth.Req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class AuthPostReissueReq {

    @Schema(description = "RefreshToken", example = "asd1354agdfgds")
    private String refreshToken;
}
