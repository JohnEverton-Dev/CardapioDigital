package com.alvestech.cardapio.cliente.application.service;

import com.alvestech.cardapio.cliente.application.api.ClienteRequest;
import com.alvestech.cardapio.cliente.application.api.ClienteResponse;
import com.alvestech.cardapio.cliente.application.repository.ClienteRepository;
import com.alvestech.cardapio.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class ClienteApplicationService implements ClienteService {
    private final ClienteRepository clienteRepository;
    @Override
    public ClienteResponse saveCliente(ClienteRequest clienteRequest) {
        log.info("[start] ClienteApplicationService - saveCliente");
        Cliente cliente = clienteRepository.saveCliente(new Cliente(clienteRequest));
        log.info("[finish] ClienteApplicationService - saveCliente");
        return new ClienteResponse(cliente);
    }
}
