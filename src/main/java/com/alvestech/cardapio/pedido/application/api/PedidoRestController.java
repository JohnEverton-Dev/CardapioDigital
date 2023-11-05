package com.alvestech.cardapio.pedido.application.api;

import com.alvestech.cardapio.pedido.application.service.PedidoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
public class PedidoRestController implements PedidoAPI {
    private final PedidoService pedidoService;
    @Override
    public PedidoResponse savePedido(PedidoRequest pedidoRequest) {
        log.info("[start] PedidoRestController - savePedido");
        PedidoResponse pedidoResponse = pedidoService.savePedido(pedidoRequest);
        log.info("[finish] PedidoRestController - savePedido");
        return pedidoResponse;
    }
}