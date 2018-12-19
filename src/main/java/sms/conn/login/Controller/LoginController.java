package sms.conn.login.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class LoginController {

    @GetMapping("/")
    public String main(){
        return "login";
    }
}
