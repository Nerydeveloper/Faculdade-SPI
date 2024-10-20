package com.aplication.pedidodelivery.factory;

import com.aplication.pedidodelivery.dto.PedidoDTO;
import com.aplication.pedidodelivery.entities.ItemPedidoModel;
import com.aplication.pedidodelivery.entities.PedidoModel;
import com.aplication.pedidodelivery.entities.UsuarioModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PedidoFactory {
    public PedidoModel createPedido(PedidoDTO pedidoDTO, UsuarioModel usuario, List<ItemPedidoModel> itens) {
        PedidoModel pedidoModel = new PedidoModel();
        pedidoModel.setUsuario(usuario); // Relaciona o usuário
        pedidoModel.setItens(itens); // Associa os itens ao pedido
        pedidoModel.setTotalPedido(pedidoDTO.totalPedido());
        // Data do pedido será preenchida automaticamente na persistência (@PrePersist)
        return pedidoModel;
    }
}
