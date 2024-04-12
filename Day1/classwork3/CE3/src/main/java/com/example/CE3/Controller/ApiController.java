package com.example.CE3.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/favouritecolor")
public class ApiController {
    @GetMapping
    public String getMethod(@RequestParam String color)
    {
        return "My favourite color is "+color+" !";
    }
}
