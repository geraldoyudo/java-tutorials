package com.gerald.tutorials.apierrorhandling.controllers;

import com.gerald.tutorials.apierrorhandling.exceptions.SyntaxException;
import com.gerald.tutorials.apierrorhandling.models.ApiError;
import com.gerald.tutorials.apierrorhandling.models.HelloRequest;
import com.gerald.tutorials.apierrorhandling.models.HelloResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @PostMapping(path = "/sayHello")
    public HelloResponse sayHello(@RequestBody HelloRequest request){
        if(request.getName().contains("-")){
            throw new SyntaxException();
        }
        return HelloResponse.builder()
                .message(String.format("Hello %s!!", request.getName()))
                .build();
    }

    @ExceptionHandler(SyntaxException.class)
    public ApiError handleSyntaxException(){
        return ApiError.builder()
                .error("Syntax Error (from controller)")
                .errorCode(991)
                .build();
    }

}
