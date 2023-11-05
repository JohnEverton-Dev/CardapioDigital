package com.alvestech.cardapio.pedido.application.api;

import com.alvestech.cardapio.pedido.application.api.PedidoRequest;
import com.alvestech.cardapio.pedido.application.api.PedidoResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/v1/Pedido")
public interface PedidoAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    PedidoResponse savePedido (@Valid @RequestBody PedidoRequest pedidoRequest);
}