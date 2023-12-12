package com.springwebflux.playground.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
//import static org.mockito.Mockito.*;
class PokedexControllerTest {
    @Mock
    com.springwebflux.playground.service.PokedexService pokedexService;
    @InjectMocks
    com.springwebflux.playground.controller.PokedexController pokedexController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testRetrievePokemon(){
        when(pokedexService.retrievePokemon(anyString())).thenReturn(null);

        reactor.core.publisher.Flux<com.springwebflux.playground.model.Pokemon> result = pokedexController.retrievePokemon("input");
        Assertions.assertEquals(null, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme