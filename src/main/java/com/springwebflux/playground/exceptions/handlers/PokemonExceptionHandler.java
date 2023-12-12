package com.springwebflux.playground.exceptions.handlers;

import com.springwebflux.playground.exceptions.PokemonClientException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorMessage> pokemonClientExceptionHandle(PokemonClientException pokemonClientException) {
        return ResponseEntity.badRequest()
                .body(ErrorMessage.builder()
                        .rootError(pokemonClientException.getClass().getSimpleName())
                        .message(pokemonClientException.getMessage())
                        .build());
    }
}
