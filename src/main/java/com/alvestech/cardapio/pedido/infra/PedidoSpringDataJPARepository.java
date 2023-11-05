package com.alvestech.cardapio.pedido.infra;

import com.alvestech.cardapio.pedido.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PedidoSpringDataJPARepository extends JpaRepository<Pedido, UUID> {
}