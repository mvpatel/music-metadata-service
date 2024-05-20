package com.example.musicmetadataservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoArtistAvailableException extends RuntimeException {
    public NoArtistAvailableException(String message) {
        super(message);
    }
}
