package com.alvestech.cardapio.food.repository;

import com.alvestech.cardapio.food.domain.Food;

import java.util.UUID;

public interface FoodRepository {
    Food saveFood(Food food);
    Food findFoodById(UUID idFood);
}
