package estudos.web.primeiraapiweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "<h1>Welcome ao Spring Boot WEB.</h1>";
    }
}
