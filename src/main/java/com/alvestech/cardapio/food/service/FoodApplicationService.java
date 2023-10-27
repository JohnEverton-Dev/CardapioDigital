package com.alvestech.cardapio.food.service;

import com.alvestech.cardapio.food.application.api.FoodRequest;
import com.alvestech.cardapio.food.application.api.FoodResponse;
import com.alvestech.cardapio.food.domain.Food;
import com.alvestech.cardapio.food.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Log4j2
public class FoodApplicationService implements FoodService {
    private final FoodRepository foodRepository;

    @Override
    public FoodResponse saveFood(FoodRequest foodRequest) {
        log.info("[start] FoodApplicationService - saveFood");
        Food food = foodRepository.saveFood(new Food(foodRequest));
        log.info("[finish] FoodApplicationService - saveFood");
        return new FoodResponse(food);
    }
    @Override
    public FoodResponse findFoodById(UUID idFood) {
        log.info("[start] FoodApplicationService - findFoodById");
        Food food = foodRepository.findFoodById(idFood);
        log.info("[finish] FoodApplicationService - findFoodById");
        return new FoodResponse(food);
    }
    @Override
    public List<FoodResponse> findAllFoods() {
        log.info("[start] FoodApplicationService - findAllFoods");
        List<Food> foods = foodRepository.findAllFoods();
        log.info("[finish] FoodApplicationService - findAllFoods");
        return FoodResponse.converte(foods);
    }
    @Override
    public void updateFood(UUID idFood, FoodRequest foodRequest) {
        log.info("[start] FoodApplicationService - updateFood");
        Food food = foodRepository.findFoodById(idFood);
        food.update(foodRequest);
        foodRepository.saveFood(food);
        log.info("[finish] FoodApplicationService - updateFood");
    }
}
