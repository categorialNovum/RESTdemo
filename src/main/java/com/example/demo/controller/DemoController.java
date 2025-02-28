package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final String HELLO_MSG = "{\"message\" : \"hello, world\"}";
    private final String LOREM_MSG = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim " +
            "veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo " +
            "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore " +
            "eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in " +
            "culpa qui officia deserunt mollit anim id est laborum.";

    @GetMapping("/hello")
    String helloWorld() {
        return HELLO_MSG;
    }

    @GetMapping("/lorem")
    String loremIpsum() {
        return LOREM_MSG;
    }
}
