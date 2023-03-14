package com.jb.demo2.exceptions;

/**
 * Created by kobis on 14 Mar, 2023
 */
public class CatSystemException extends Exception {

    public CatSystemException(Error error) {
        super(error.getMessage());
    }
}
