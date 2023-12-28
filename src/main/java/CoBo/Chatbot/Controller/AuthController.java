package CoBo.Chatbot.Controller;

import CoBo.Chatbot.Data.Dto.Auth.Req.AuthPostLoginReq;
import CoBo.Chatbot.Data.Dto.Auth.Res.AuthPostLoginRes;
import CoBo.Chatbot.Service.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    @Operation(summary = "로그인 API", description = "이메일과 비밀번호를 사용하여 토큰을 반환")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "성공",
                content = @Content(schema = @Schema(implementation = AuthPostLoginRes.class), mediaType = "application/json")),
            @ApiResponse(responseCode = "401", description = "없는 계정입니다.",
                content = @Content()),
            @ApiResponse(responseCode = "403", description = "비밀번호가 틀렸습니다.",
                content = @Content())
    })
    public ResponseEntity<AuthPostLoginRes> postLogin(@RequestBody AuthPostLoginReq authPostLoginReq){
        return authService.postLogin(authPostLoginReq);
    }
}
