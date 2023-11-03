package com.alvestech.cardapio.food.infra;

import com.alvestech.cardapio.food.domain.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FoodSpringDataJPARepository extends JpaRepository<Food, UUID> {

}