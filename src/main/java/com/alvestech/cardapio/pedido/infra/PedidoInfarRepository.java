package com.alvestech.cardapio.pedido.infra;

import com.alvestech.cardapio.pedido.application.repository.PedidoRepository;
import com.alvestech.cardapio.pedido.domain.Pedido;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Log4j2
public class PedidoInfarRepository implements PedidoRepository {
    private final PedidoSpringDataJPARepository pedidoSpringDataJPARepository;
    @Override
    public Pedido savePedido(Pedido pedido) {
        log.info("[start] PedidoInfarRepository - savePedido");
        Pedido pedidoCreat = pedidoSpringDataJPARepository.save(pedido);
        log.info("[start] PedidoInfarRepository - savePedido");
        return pedidoCreat;
    }
}
