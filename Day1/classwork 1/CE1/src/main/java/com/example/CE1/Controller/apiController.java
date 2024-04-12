package com.example.CE1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiController {
    @GetMapping("/abc")
    public String getMethodNmae()
    {
        return "Hi, This is Nawin Vignesh H!";
    }
}
