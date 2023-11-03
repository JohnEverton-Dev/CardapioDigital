package com.alvestech.cardapio.food.domain;

import com.alvestech.cardapio.food.application.api.FoodRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idFood;
    private String nomeProduto;
    private String imagemProduto;
    private Double valorProduto;

    public Food(FoodRequest foodRequest) {
        this.nomeProduto = foodRequest.getNomeProduto();
        this.imagemProduto = foodRequest.getImagemProduto();
        this.valorProduto = Double.valueOf(foodRequest.getValorProduto());
    }

    public void update(FoodRequest foodRequest) {
        this.nomeProduto = foodRequest.getNomeProduto();
        this.imagemProduto = foodRequest.getImagemProduto();
        this.valorProduto = Double.valueOf(foodRequest.getValorProduto());
    }
}