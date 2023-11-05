package com.alvestech.cardapio.pedido.domain;

import com.alvestech.cardapio.cliente.domain.Cliente;
import com.alvestech.cardapio.food.domain.Food;
import com.alvestech.cardapio.pedido.application.api.PedidoRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idPedido;
    @Enumerated(EnumType.STRING)
    private NumeroMesa numeroMesa;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    @JsonIgnore
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "food_id")
    @JsonIgnore
    private Food food;

    public Pedido(Cliente cliente, Food food, PedidoRequest pedidoRequest) {
        this.numeroMesa = pedidoRequest.getNumeroMesa();
        this.cliente = cliente;
        this.food = food;
    }
}