package com.alvestech.cardapio.food.application.api;

import com.alvestech.cardapio.food.domain.Food;
import lombok.Value;

import java.util.UUID;

@Value
public class FoodResponse {
    UUID idFood;
    String nomeProduto;
    String imagemProduto;
    Integer valorProduto;

    public FoodResponse(Food food) {
        this.idFood = food.getIdFood();
        this.nomeProduto = food.getNomeProduto();
        this.imagemProduto = food.getImagemProduto();
        this.valorProduto = food.getValorProduto();
    }
}