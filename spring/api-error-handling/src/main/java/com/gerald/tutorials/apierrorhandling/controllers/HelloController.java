package com.gerald.tutorials.apierrorhandling.controllers;

import com.gerald.tutorials.apierrorhandling.models.HelloRequest;
import com.gerald.tutorials.apierrorhandling.models.HelloResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @PostMapping(path = "/sayHello")
    public HelloResponse sayHello(@RequestBody HelloRequest request){
        return HelloResponse.builder()
                .message(String.format("Hello %s!!", request.getName()))
                .build();
    }

}
