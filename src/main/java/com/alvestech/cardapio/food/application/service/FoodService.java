package com.alvestech.cardapio.food.application.service;

import com.alvestech.cardapio.food.application.api.FoodRequest;
import com.alvestech.cardapio.food.application.api.FoodResponse;

import java.util.List;
import java.util.UUID;

public interface FoodService {
    FoodResponse saveFood(FoodRequest foodRequest);
    FoodResponse findFoodById(UUID idFood);
    List<FoodResponse> findAllFoods();
    void updateFood(UUID idFood, FoodRequest foodRequest);
    void deleteFood(UUID idFood);
}