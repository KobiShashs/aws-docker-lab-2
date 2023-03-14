package com.jb.demo2.exceptions;

/**
 * Created by kobis on 14 Mar, 2023
 */
public enum Error {



    ID_NOT_FOUND("cat id not found"),
    ID_ALREADY_FOUND("cat id already exist");

    private String message;

    Error(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
