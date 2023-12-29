package CoBo.Chatbot.Data.Dto.Auth.Res;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthPostReissueRes {

    @Schema(description = "accessToken", example = "asdfasdg25asdgsd")
    private String accessToken;

    @Schema(description = "refreshToken", example = "2q5tdsgsadf141!sdafasd")
    private String refreshToken;

    @Builder
    public AuthPostReissueRes(String accessToken, String refreshToken){
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }
}
