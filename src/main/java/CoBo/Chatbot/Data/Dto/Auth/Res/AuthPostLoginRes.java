package CoBo.Chatbot.Data.Dto.Auth.Res;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthPostLoginRes {

    private String accessToken;

    private String refreshToken;

    @Builder
    public AuthPostLoginRes(String accessToken, String refreshToken){
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }
}
