package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {

    		int num1 = 4;
    		int num2 = 5;

    		int num3 = num1+num2;

        return "Greetings from Spring Boot!" + " test " +num3;
    }
    
}
