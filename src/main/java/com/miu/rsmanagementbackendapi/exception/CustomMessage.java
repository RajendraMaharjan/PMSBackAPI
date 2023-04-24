package com.miu.rsmanagementbackendapi.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class CustomMessage {
    private String message;
    private HttpStatus httpStatus;
}
