package com.alvestech.cardapio.food.service;

import com.alvestech.cardapio.food.application.api.FoodRequest;
import com.alvestech.cardapio.food.application.api.FoodResponse;

import java.util.UUID;

public interface FoodService {
    FoodResponse saveFood(FoodRequest foodRequest);
    FoodResponse findFoodById(UUID idFood);
}