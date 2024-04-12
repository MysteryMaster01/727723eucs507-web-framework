package com.example.CE5.contoller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
@RequestMapping("family")
public class FamilyController {
    @GetMapping
    public List<Family> getMethod(){
        List<Family>l = new ArrayList<>();
        l.add(new Family("John",23));
        return l;
    }
}
