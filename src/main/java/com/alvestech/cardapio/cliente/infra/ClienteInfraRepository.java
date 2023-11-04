package com.alvestech.cardapio.cliente.infra;

import com.alvestech.cardapio.cliente.application.repository.ClienteRepository;
import com.alvestech.cardapio.cliente.domain.Cliente;
import com.alvestech.cardapio.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Log4j2
public class ClienteInfraRepository implements ClienteRepository {
    private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;

    @Override
    public Cliente saveCliente(Cliente cliente) {
        log.info("[start] ClienteInfraRepository - saveCliente");
        Cliente clienteCreat = clienteSpringDataJPARepository.save(cliente);
        log.info("[finish] ClienteInfraRepository - saveCliente");
        return clienteCreat;
    }
    @Override
    public Cliente findClienteById(UUID idCliente) {
        log.info("[start] ClienteInfraRepository - saveCliente");
        Optional<Cliente> optionalCliente = clienteSpringDataJPARepository.findById(idCliente);
        Cliente cliente = optionalCliente
                .orElseThrow(()-> APIException
                        .build(HttpStatus.BAD_REQUEST, "Cliente não encontrado!"));
        log.info("[finish] ClienteInfraRepository - saveCliente");
        return cliente;
    }
}