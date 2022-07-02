package com.pingpong.pingpongteganatufe;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingPongController {

    @RequestMapping
    public String sayDefaultMessage() {
        return "Hi";
    }

    @RequestMapping("/ping")
    public String sayPing() {
        return "pong";
    }
}
