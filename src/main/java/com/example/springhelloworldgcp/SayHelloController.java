package com.example.springhelloworldgcp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellov1")
public class SayHelloController {

    @GetMapping
    public String getMessage() {
        return String.format("This is hello from pod 1");
    }
}
