package com.alvestech.cardapio.food.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/v1/Food")
public interface FoodAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    FoodResponse saveFood (@Valid @RequestBody FoodRequest foodRequest);

    @GetMapping("/{idFood}")
    @ResponseStatus(code = HttpStatus.OK)
    FoodResponse findFoodById (@PathVariable UUID idFood);

    @GetMapping("/findAllFoods")
    @ResponseStatus(code = HttpStatus.OK)
    List<FoodResponse> findAllFoods();

    @PatchMapping("/update/{idFood}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void updateFood (@PathVariable UUID idFood, @Valid @RequestBody FoodRequest foodRequest);
}