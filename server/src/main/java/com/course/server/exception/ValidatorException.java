package com.course.server.exception;

/**
 * @author Yilinlou
 * @date 11/21/20 8:12 下午
 * @Email:ylou7@stevens.edu
 */
public class ValidatorException extends RuntimeException {

    public ValidatorException(String message) {
        super(message);
    }
}