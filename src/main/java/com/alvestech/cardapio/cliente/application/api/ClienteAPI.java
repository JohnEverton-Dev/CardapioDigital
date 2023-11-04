package com.alvestech.cardapio.cliente.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/v1/Cliente")
public interface ClienteAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ClienteResponse saveCliente (@Valid @RequestBody ClienteRequest clienteRequest);

    @GetMapping("/{idCliente}")
    @ResponseStatus(code = HttpStatus.OK)
    ClienteResponse findClienteById (@PathVariable UUID idCliente);

    @GetMapping("/findAllClientes")
    @ResponseStatus(code = HttpStatus.OK)
    List<ClienteResponse> findAllClientes();
}