package com.alvestech.cardapio.food.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class FoodRequest {
    String nomeProduto;
    String imagemProduto;
    Integer valorProduto;
}