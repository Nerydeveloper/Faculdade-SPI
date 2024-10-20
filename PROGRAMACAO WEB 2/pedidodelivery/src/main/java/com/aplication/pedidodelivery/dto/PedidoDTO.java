package com.aplication.pedidodelivery.dto;

import com.aplication.pedidodelivery.entities.ItemPedidoModel;
import com.aplication.pedidodelivery.entities.UsuarioModel;

import java.util.Date;
import java.util.List;

public record PedidoDTO(Long usuario_id,
                        List<ItemPedidoDTO> itens,
                        Double totalPedido) {}