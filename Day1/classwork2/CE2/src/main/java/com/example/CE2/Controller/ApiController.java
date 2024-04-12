package com.example.CE2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class ApiController {
    @GetMapping("/studentName")
    public String getMethodName(@RequestParam String studentName)
    {
        return "Sir "+studentName+" !";
    }
}
