package CoBo.Chatbot.Service;

import CoBo.Chatbot.Data.Dto.Auth.Req.AuthPostLoginReq;
import CoBo.Chatbot.Data.Dto.Auth.Res.AuthPostLoginRes;
import org.springframework.http.ResponseEntity;

public interface AuthService {

    ResponseEntity<AuthPostLoginRes> postLogin(AuthPostLoginReq authPostLoginReq);
}
