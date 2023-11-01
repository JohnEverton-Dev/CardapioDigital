package com.alvestech.cardapio.food.application.api;

import com.alvestech.cardapio.food.application.service.FoodService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Log4j2
public class FoodRestController implements FoodAPI {
    private final FoodService foodService;

    @Override
    public FoodResponse saveFood(FoodRequest foodRequest) {
        log.info("[start] FoodRestController - saveFood");
        FoodResponse foodResponse = foodService.saveFood(foodRequest);
        log.info("[finish] FoodRestController - saveFood");
        return foodResponse;
    }
    @Override
    public FoodResponse findFoodById(UUID idFood) {
        log.info("[start] FoodRestController - findFoodById");
        FoodResponse foodResponse = foodService.findFoodById(idFood);
        log.info("[finish] FoodRestController - findFoodById");
        return foodResponse;
    }
    @Override
    public List<FoodResponse> findAllFoods() {
        log.info("[start] FoodRestController - findAllFoods");
        List<FoodResponse> foodResponses = foodService.findAllFoods();
        log.info("[finish] FoodRestController - findAllFoods");
        return foodResponses;
    }
    @Override
    public void updateFood(UUID idFood, FoodRequest foodRequest) {
        log.info("[start] FoodRestController - updateFood");
        foodService.updateFood(idFood, foodRequest);
        log.info("[finish] FoodRestController - updateFood");
    }
    @Override
    public void deleteFood(UUID idFood) {
        log.info("[start] FoodRestController - deleteFood");
        foodService.deleteFood(idFood);
        log.info("[finish] FoodRestController - deleteFood");
    }
}