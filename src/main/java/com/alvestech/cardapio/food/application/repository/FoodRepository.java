package com.alvestech.cardapio.food.application.repository;

import com.alvestech.cardapio.food.domain.Food;

import java.util.List;
import java.util.UUID;

public interface FoodRepository {
    Food saveFood(Food food);
    Food findFoodById(UUID idFood);
    List<Food> findAllFoods();
    void deleteFood(UUID idFood);
}
