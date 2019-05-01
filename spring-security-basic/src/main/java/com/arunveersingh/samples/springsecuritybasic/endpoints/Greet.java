package com.arunveersingh.samples.springsecuritybasic.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/greet")
public class Greet {

    @GetMapping("/")
    public String greet(){
        return "Hello World! current time is " + new Date();
    }

}
