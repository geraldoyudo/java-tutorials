package com.gerald.tutorials.apierrorhandling.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class ApiError {

    private LocalDateTime timestamp = LocalDateTime.now();
    private String error = "";
    private int errorCode = 0;
    private List<ErrorCause> causes = new ArrayList<>();
}
