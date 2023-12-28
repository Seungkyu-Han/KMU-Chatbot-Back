package CoBo.Chatbot.Controller.ExceptionHandler;

import CoBo.Chatbot.Controller.AuthController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackageClasses = AuthController.class)
public class AuthExceptionHandler{

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> AuthNullPointerExceptionHandler(){
        return new ResponseEntity<>("인증에 필요한 정보가 누락되었거나 잘못된 정보입니다.", HttpStatus.FORBIDDEN);
    }
}
