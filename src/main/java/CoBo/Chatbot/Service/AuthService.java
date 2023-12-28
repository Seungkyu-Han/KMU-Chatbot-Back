package CoBo.Chatbot.Service;

import CoBo.Chatbot.Data.Dto.Auth.Req.AuthPostLoginReq;
import CoBo.Chatbot.Data.Dto.Auth.Res.AuthPostLoginRes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;

public interface AuthService {

    ResponseEntity<AuthPostLoginRes> postLogin(AuthPostLoginReq authPostLoginReq);

    ResponseEntity<HttpStatus> check(Authentication authentication);
}
