package io.rsi.codespace.springsecuritypractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home() {
        return "<h1>Welcome to Spring Security</h1>";
    }

    @GetMapping("/user")
    public String user() {
        return "<h1>Hello User, Welcome to Spring Security</h1>";
    }

    @GetMapping("/admin")
    public String admin() {
        return "<h1>Hello admin, Welcome to Spring Security</h1>";
    }
}
