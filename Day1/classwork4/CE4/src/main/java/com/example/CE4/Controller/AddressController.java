package com.example.CE4.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {
    @GetMapping
    public Address getMethod(){
        Address ad = new Address("Main St","123");
        return ad;
    }
}
