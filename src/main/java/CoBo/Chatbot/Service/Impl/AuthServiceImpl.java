package CoBo.Chatbot.Service.Impl;

import CoBo.Chatbot.Config.Jwt.JwtTokenProvider;
import CoBo.Chatbot.Data.Dto.Auth.Req.AuthPostLoginReq;
import CoBo.Chatbot.Data.Dto.Auth.Res.AuthPostLoginRes;
import CoBo.Chatbot.Data.Entity.User;
import CoBo.Chatbot.Repository.UserRepository;
import CoBo.Chatbot.Service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final JwtTokenProvider jwtTokenProvider;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public ResponseEntity<AuthPostLoginRes> postLogin(AuthPostLoginReq authPostLoginReq) {
        User user = userRepository.findByEmail(authPostLoginReq.getEmail());

        if(user == null)
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);

        if(!bCryptPasswordEncoder.matches(authPostLoginReq.getPassword(), user.getPassword())){
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }

        String accessToken = jwtTokenProvider.createAccessToken(user.getId());
        String refreshToken = jwtTokenProvider.createRefreshToken(user.getId());

        return new ResponseEntity<>(AuthPostLoginRes.builder()
                    .accessToken(accessToken)
                    .refreshToken(refreshToken)
                    .build(),
                HttpStatus.OK);
    }
}
