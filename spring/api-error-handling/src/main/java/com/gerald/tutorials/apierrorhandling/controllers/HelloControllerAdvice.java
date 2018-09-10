package com.gerald.tutorials.apierrorhandling.controllers;

import com.gerald.tutorials.apierrorhandling.exceptions.SyntaxException;
import com.gerald.tutorials.apierrorhandling.models.ApiError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HelloControllerAdvice {
    @ExceptionHandler(Exception.class)
    public ApiError handleSyntaxException2(){
        return ApiError.builder()
                .error("General Error (from controller-advice)")
                .errorCode(991)
                .build();
    }

    @ExceptionHandler(SyntaxException.class)
    public ApiError handleSyntaxException(){
        return ApiError.builder()
                .error("Syntax Error (from controller-advice)")
                .errorCode(991)
                .build();
    }

}
