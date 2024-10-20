package com.aplication.pedidodelivery.factory;

import com.aplication.pedidodelivery.dto.UsuarioDTO;
import com.aplication.pedidodelivery.entities.UsuarioModel;
import org.springframework.stereotype.Component;

@Component
public class UsuarioFactory {
    public UsuarioModel createUsuario(UsuarioDTO usuarioDTO) {
        UsuarioModel usuarioModel = new UsuarioModel();
        usuarioModel.setNome(usuarioDTO.nome());
        usuarioModel.setEmail(usuarioDTO.email());
        usuarioModel.setSenha(usuarioDTO.senha());
        usuarioModel.setEndereco(usuarioDTO.endereco());
        usuarioModel.setTelefone(usuarioDTO.telefone());
        return usuarioModel;
    }
}
