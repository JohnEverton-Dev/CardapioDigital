package com.alvestech.cardapio.pedido.application.service;

import com.alvestech.cardapio.cliente.application.repository.ClienteRepository;
import com.alvestech.cardapio.cliente.domain.Cliente;
import com.alvestech.cardapio.food.application.repository.FoodRepository;
import com.alvestech.cardapio.food.domain.Food;
import com.alvestech.cardapio.pedido.application.api.PedidoRequest;
import com.alvestech.cardapio.pedido.application.api.PedidoResponse;
import com.alvestech.cardapio.pedido.application.repository.PedidoRepository;
import com.alvestech.cardapio.pedido.domain.Pedido;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class PedidoApplicationService implements PedidoService {
    private final PedidoRepository pedidoRepository;
    private final ClienteRepository clienteRepository;
    private final FoodRepository foodRepository;
    @Override
    public PedidoResponse savePedido(PedidoRequest pedidoRequest) {
        log.info("[start] PedidoApplicationService - savePedido");
        Cliente cliente = clienteRepository.findClienteById(pedidoRequest.getIdCliente());
        Food food = foodRepository.findFoodById(pedidoRequest.getIdFood());
        Pedido pedido = pedidoRepository.savePedido(new Pedido(cliente, food, pedidoRequest));
        log.info("[finish] PedidoApplicationService - savePedido");
        return new PedidoResponse(pedido);
    }
}