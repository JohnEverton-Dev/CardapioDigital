package com.alvestech.cardapio.food.application.api;

import com.alvestech.cardapio.food.domain.Food;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class FoodResponse {
    UUID idFood;
    String nomeProduto;
    String imagemProduto;
    Double valorProduto;

    public FoodResponse(Food food) {
        this.idFood = food.getIdFood();
        this.nomeProduto = food.getNomeProduto();
        this.imagemProduto = food.getImagemProduto();
        this.valorProduto = food.getValorProduto();
    }

    public static List<FoodResponse> converte(List<Food> foods) {
        return foods.stream()
                .map(FoodResponse::new)
                .collect(Collectors.toList());
    }
}