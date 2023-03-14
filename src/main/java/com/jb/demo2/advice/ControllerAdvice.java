package com.jb.demo2.advice;

import com.jb.demo2.exceptions.CatSystemException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.URI;

/**
 * Created by kobis on 14 Mar, 2023
 */
@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(CatSystemException.class)
    public ProblemDetail handleCatSystemException(Exception e) {
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, e.getMessage());
        problemDetail.setTitle("Cat System Exception");
        problemDetail.setInstance(URI.create("api/cats"));
        problemDetail.setDetail("spring boot new feature using Problem Detail class");
        return problemDetail;
    }
}
