package com.aplication.pedidodelivery.factory;

import com.aplication.pedidodelivery.dto.ItemPedidoDTO;
import com.aplication.pedidodelivery.entities.ItemPedidoModel;
import com.aplication.pedidodelivery.entities.PedidoModel;
import com.aplication.pedidodelivery.entities.ProdutoModel;
import org.springframework.stereotype.Component;

@Component
public class ItemPedidoFactory {
    public ItemPedidoModel createItemPedido(Long itemId, PedidoModel pedido, ProdutoModel produto) {
        // Lógica para criar o ItemPedido com base nos parâmetros
        ItemPedidoModel itemPedido = new ItemPedidoModel();
        itemPedido.setPedido(pedido);
        itemPedido.setProduto(produto);
        return itemPedido;
    }
}
