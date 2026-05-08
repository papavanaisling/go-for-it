package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", defaultValue = "World") String name) {
        String formatted = name.isEmpty()
                ? "World"
                : Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase();
        return "Hello " + formatted + ", how are you";
    }
}
