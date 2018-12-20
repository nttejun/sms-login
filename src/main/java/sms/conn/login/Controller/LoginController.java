package sms.conn.login.Controller;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@AllArgsConstructor
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    @GetMapping("/login")
    public String main(){
        logger.info(">>> START Request /login");
        return "login";
    }

}
