package com.aditya.bukatoko.productservice.exception;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {
    @NonNull
    private Date timestamp;
    @NonNull
    private String message;
    @NonNull
    private String detail;
}