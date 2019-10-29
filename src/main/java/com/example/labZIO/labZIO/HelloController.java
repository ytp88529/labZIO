package com.example.labZIO.labZIO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String metoda1()
    {
        return "Hello " + LocalDateTime.now();
    }
}
