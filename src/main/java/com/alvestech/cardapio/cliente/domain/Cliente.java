package com.alvestech.cardapio.cliente.domain;

import com.alvestech.cardapio.cliente.application.api.ClienteRequest;
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
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idCliente;
    private String nomeCliente;
    private String celular;

    public Cliente(ClienteRequest clienteRequest) {
        this.nomeCliente = clienteRequest.getNomeCliente();
        this.celular = clienteRequest.getCelular();
    }
}
