package com.alvestech.cardapio.pedido.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/v1/Pedido")
public interface PedidoAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    PedidoResponse savePedido (@Valid @RequestBody PedidoRequest pedidoRequest);

    @GetMapping("/{idPedido}")
    @ResponseStatus(code = HttpStatus.OK)
    PedidoResponse findPedidoById (@PathVariable UUID idPedido);

    @GetMapping("/findAllPedidos")
    @ResponseStatus(code = HttpStatus.OK)
    List<PedidoResponse> findAllPedidos();
}