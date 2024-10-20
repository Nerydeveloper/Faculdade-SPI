package com.aplication.pedidodelivery.repository;

import com.aplication.pedidodelivery.entities.ItemPedidoModel;
import com.aplication.pedidodelivery.entities.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedidoModel, Long> {
    List<ItemPedidoModel> findByPedidoId(PedidoModel pedido);
}
