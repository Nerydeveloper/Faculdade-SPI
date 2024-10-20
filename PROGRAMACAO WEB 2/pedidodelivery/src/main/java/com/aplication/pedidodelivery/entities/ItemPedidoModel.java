package com.aplication.pedidodelivery.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "tb_itemPedido")
@NoArgsConstructor
@AllArgsConstructor
public class ItemPedidoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_pedido_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="pedido_id", nullable=false)
    private PedidoModel pedido;

    @ManyToOne
    @JoinColumn(name="produto_id", nullable = false)
    private ProdutoModel produto;

    @Column(name="quantidadeItem")
    private int quantidadeItem;


}
