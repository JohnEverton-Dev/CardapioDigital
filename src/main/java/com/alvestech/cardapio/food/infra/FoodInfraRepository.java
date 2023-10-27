package com.alvestech.cardapio.food.infra;

import com.alvestech.cardapio.food.domain.Food;
import com.alvestech.cardapio.food.repository.FoodRepository;
import com.alvestech.cardapio.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Log4j2
public class FoodInfraRepository implements FoodRepository {
    private final FoodSpringDataJPARepository foodSpringDataJPARepository;

    @Override
    public Food saveFood(Food food) {
        log.info("[start] FoodInfraRepository - saveFood");
        Food foodCreat = foodSpringDataJPARepository.save(food);
        log.info("[finish] FoodInfraRepository - saveFood");
        return foodCreat;
    }
    @Override
    public Food findFoodById(UUID idFood) {
        log.info("[start] FoodInfraRepository - findFoodById");
        Optional<Food> optionalFood = foodSpringDataJPARepository.findById(idFood);
        Food food = optionalFood.orElseThrow(()-> APIException.build(HttpStatus.BAD_REQUEST, "ID INVÁLIDO!"));
        log.info("[finish] FoodInfraRepository - findFoodById");
        return food;
    }
}
