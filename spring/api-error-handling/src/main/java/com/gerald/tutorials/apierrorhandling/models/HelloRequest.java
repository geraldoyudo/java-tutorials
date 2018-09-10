package com.gerald.tutorials.apierrorhandling.models;

import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class HelloRequest {

    @NotEmpty
    private String name;
}
