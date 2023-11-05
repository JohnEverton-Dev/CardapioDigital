package com.alvestech.cardapio.pedido.infra;

import com.alvestech.cardapio.handler.APIException;
import com.alvestech.cardapio.pedido.application.repository.PedidoRepository;
import com.alvestech.cardapio.pedido.domain.Pedido;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Log4j2
public class PedidoInfraRepository implements PedidoRepository {
    private final PedidoSpringDataJPARepository pedidoSpringDataJPARepository;
    @Override
    public Pedido savePedido(Pedido pedido) {
        log.info("[start] PedidoInfarRepository - savePedido");
        Pedido pedidoCreat = pedidoSpringDataJPARepository.save(pedido);
        log.info("[start] PedidoInfarRepository - savePedido");
        return pedidoCreat;
    }
    @Override
    public Pedido findPedidoById(UUID idPedido) {
        log.info("[start] PedidoInfarRepository - findPedidoById");
        Optional<Pedido> optionalPedido = pedidoSpringDataJPARepository.findById(idPedido);
        Pedido pedido = optionalPedido.orElseThrow(()-> APIException
                .build(HttpStatus.BAD_REQUEST, "Pedido não encontrado!"));
        log.info("[start] PedidoInfarRepository - findPedidoById");
        return pedido;
    }
    @Override
    public List<Pedido> findAllPedidos() {
        log.info("[start] PedidoInfarRepository - findAllPedidos");
        List<Pedido> pedidos = pedidoSpringDataJPARepository.findAll();
        log.info("[finish] PedidoInfarRepository - findAllPedidos");
        return pedidos;
    }
}
