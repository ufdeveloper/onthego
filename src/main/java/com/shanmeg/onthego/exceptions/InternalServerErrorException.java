package com.shanmeg.onthego.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpStatusCodeException;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

/**
 * Created by shantanu on 2/4/19.
 */

@ResponseStatus(INTERNAL_SERVER_ERROR)
public class InternalServerErrorException extends HttpStatusCodeException {

    public InternalServerErrorException(String msg) {
        super(INTERNAL_SERVER_ERROR, msg);
    }
}