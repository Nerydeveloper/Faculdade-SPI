package com.aplication.pedidodelivery.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "tb_pedidos")
@NoArgsConstructor
@AllArgsConstructor
public class PedidoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_pedido")
    private Long id;

    @ManyToOne
    @JoinColumn(name="usuario_id", nullable = false)
    private UsuarioModel usuario;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemPedidoModel> itens;

    @Column(name="totalPedido")
    private Double totalPedido;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dataPedido")
    private Date dataPedido;

    @PrePersist
    @PreUpdate
    private void calcularTotalPedido(){
        if( this.dataPedido == null ){
            this.dataPedido = new Date();
        }
        this.totalPedido = itens.stream()
                .mapToDouble(item -> item.getProduto().getPrecoProduto() * item.getQuantidadeItem())
                .sum();
    }





}
