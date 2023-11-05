package com.alvestech.cardapio.cliente.domain;

import com.alvestech.cardapio.cliente.application.api.ClienteRequest;
import com.alvestech.cardapio.pedido.domain.Pedido;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idCliente;
    private String nomeCliente;
    private String celular;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cliente")
    @JsonIgnore
    private List<Pedido> pedidos;

    public Cliente(ClienteRequest clienteRequest) {
        this.nomeCliente = clienteRequest.getNomeCliente();
        this.celular = clienteRequest.getCelular();
    }
}
