package com.alvestech.cardapio.food.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/v1/Food")
public interface FoodAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    FoodResponse saveFood (@Valid @RequestBody FoodRequest foodRequest);

    @GetMapping("/{idFood}")
    @ResponseStatus(code = HttpStatus.OK)
    FoodResponse findFoodById (@PathVariable UUID idFood);

}