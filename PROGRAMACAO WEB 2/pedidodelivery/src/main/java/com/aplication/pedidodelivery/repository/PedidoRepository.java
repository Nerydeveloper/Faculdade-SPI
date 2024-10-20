package com.aplication.pedidodelivery.repository;

import com.aplication.pedidodelivery.entities.PedidoModel;
import com.aplication.pedidodelivery.entities.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoModel, Long> {
    List<PedidoModel> findByUsuario(UsuarioModel usuario);
}
