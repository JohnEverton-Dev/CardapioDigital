package com.alvestech.cardapio.cliente.application.service;

import com.alvestech.cardapio.cliente.application.api.ClienteRequest;
import com.alvestech.cardapio.cliente.application.api.ClienteResponse;
import com.alvestech.cardapio.cliente.application.repository.ClienteRepository;
import com.alvestech.cardapio.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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
    @Override
    public ClienteResponse findClienteById(UUID idCliente) {
        log.info("[start] ClienteApplicationService - findClienteById");
        Cliente cliente = clienteRepository.findClienteById(idCliente);
        log.info("[finish] ClienteApplicationService - findClienteById");
        return new ClienteResponse(cliente);
    }
    @Override
    public List<ClienteResponse> findAllClientes() {
        log.info("[start] ClienteApplicationService - findAllClientes");
        List<Cliente> clientes = clienteRepository.findAllClientes();
        log.info("[finish] ClienteApplicationService - findAllClientes");
        return ClienteResponse.converte(clientes);
    }
}
