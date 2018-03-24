package login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureLoginController {

    @RequestMapping("/login")
    public Greeting greeting(@RequestParam(value="token", defaultValue="") String token) {
        boolean isValidToken = checkIfValidToken(token);

        return new Greeting(isValidToken,
                            "DefaultUser");
    }

    private static boolean checkIfValidToken(String token){
        if(token.equals("valid")){
            System.out.println("Good token.");
           return true;
        }
        else{
            System.out.println("Bad token.");
            return false;
        }
    }
}
