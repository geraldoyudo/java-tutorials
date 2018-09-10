package com.gerald.tutorials.apierrorhandling.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HelloResponse {

    private String message;
}
