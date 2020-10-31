package io.rsi.codespace.springbootdockerexample.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest")
public class HelloResource {

    @GetMapping("/docker/hello")
    public String hello() {
        return "Hello Docker";
    }

}
