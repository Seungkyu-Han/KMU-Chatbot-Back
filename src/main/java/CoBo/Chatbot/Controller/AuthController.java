package CoBo.Chatbot.Controller;

import CoBo.Chatbot.Data.Dto.Auth.Req.AuthPostLoginReq;
import CoBo.Chatbot.Data.Dto.Auth.Res.AuthPostLoginRes;
import CoBo.Chatbot.Service.AuthService;
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
    public ResponseEntity<AuthPostLoginRes> postLogin(@RequestBody AuthPostLoginReq authPostLoginReq){
        return authService.postLogin(authPostLoginReq);
    }
}
