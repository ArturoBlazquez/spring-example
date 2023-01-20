package com.arturobl.springExample.dog;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DogNotFoundException extends RuntimeException {

    public DogNotFoundException(Long dogId) {
        super(String.format("Dog with id %s could not be found.", dogId));
    }

}
