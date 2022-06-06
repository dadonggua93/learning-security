package org.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/app")
@RestController
public class AppController {

    @GetMapping
    public String info() {
        return "app detail";
    }

}
