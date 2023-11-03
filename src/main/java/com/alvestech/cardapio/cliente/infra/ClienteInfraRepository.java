package com.alvestech.cardapio.cliente.infra;

import com.alvestech.cardapio.cliente.application.repository.ClienteRepository;
import com.alvestech.cardapio.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

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
}