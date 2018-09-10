package com.gerald.tutorials.apierrorhandling.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Data
@Builder
public class ApiError {

    private LocalDateTime timestamp;
    private String error;
    private int errorCode;
    @Singular
    private List<ErrorCause> causes;

    private ApiError(LocalDateTime timestamp, String error, int errorCode, List<ErrorCause> causes) {
        this.timestamp = timestamp == null? LocalDateTime.now(): timestamp ;
        this.error = error == null? "": error;
        this.errorCode = errorCode;
        this.causes = causes == null? Collections.emptyList(): causes;
    }
}
