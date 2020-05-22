package com.antelope.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangmeiliang
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Hello World!";
    }
}
