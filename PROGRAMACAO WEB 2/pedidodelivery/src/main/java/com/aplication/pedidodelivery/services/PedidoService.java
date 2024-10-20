package com.aplication.pedidodelivery.services;

import com.aplication.pedidodelivery.dto.PedidoDTO;
import com.aplication.pedidodelivery.entities.ItemPedidoModel;
import com.aplication.pedidodelivery.entities.PedidoModel;
import com.aplication.pedidodelivery.entities.ProdutoModel;
import com.aplication.pedidodelivery.entities.UsuarioModel;
import com.aplication.pedidodelivery.repository.PedidoRepository;
import com.aplication.pedidodelivery.repository.ProdutoRepository;
import com.aplication.pedidodelivery.repository.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    // CADASTRAR
//    @Transactional
//    public void cadastrarPedido(PedidoDTO pedidoDTO) {
//        UsuarioModel usuario = usuarioRepository.findById(pedidoDTO.usuario_id())
//                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
//
//        PedidoModel pedido = new PedidoModel();
//        pedido.setUsuario(usuario);
//        pedido.setTotalPedido(pedidoDTO.totalPedido());
//        pedido.setDataPedido(new Date()); // Usar a data atual
//
//
//        // Iterar sobre os itens do pedido e associá-los
//        List<ItemPedidoModel> itens = pedidoDTO.itens().stream().map(itemDTO -> {
//            ProdutoModel produto = produtoRepository.findById(itemDTO.produtoId())
//                    .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
//
//            // Criar um novo ItemPedido
//            ItemPedidoModel itemPedido = new ItemPedidoModel();
//            itemPedido.setPedido(pedido); // Associar o item ao pedido
//            itemPedido.setProduto(produto); // Associar o produto ao item
//            itemPedido.setQuantidadeItem(itemDTO.quantidade());
//
//            return itemPedido;
//        }).collect(Collectors.toList());
//
//        // Associar os itens ao pedido
//        pedido.setItens(itens);
//
//        pedidoRepository.save(pedido);
//    }

    @Transactional
    public void cadastrarPedido(PedidoDTO pedidoDTO) {
        UsuarioModel usuario = usuarioRepository.findById(pedidoDTO.usuario_id())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        PedidoModel pedido = new PedidoModel();
        pedido.setUsuario(usuario);
        pedido.setTotalPedido(pedidoDTO.totalPedido());
        pedido.setDataPedido(new Date()); // Usar a data atual

        // Iterar sobre os itens do pedido e associá-los
        List<ItemPedidoModel> itens = pedidoDTO.itens().stream().map(itemDTO -> {
            ProdutoModel produto = produtoRepository.findById(itemDTO.produtoId())
                    .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

            // Criar um novo ItemPedido
            ItemPedidoModel itemPedido = new ItemPedidoModel();
            itemPedido.setPedido(pedido); // Associar o item ao pedido
            itemPedido.setProduto(produto); // Associar o produto ao item
            itemPedido.setQuantidadeItem(itemDTO.quantidade());

            return itemPedido;
        }).collect(Collectors.toList());

        // Associar os itens ao pedido
        pedido.setItens(itens);

        pedidoRepository.save(pedido);
    }


    // ATUALIZAR
    @Transactional
    public PedidoModel atualizarPedido(Long codigoPedido, PedidoDTO pedidoDTO) {
        Optional<PedidoModel> pedidoExistente = pedidoRepository.findById(codigoPedido);

        if (pedidoExistente.isPresent()) {
            PedidoModel pedido = pedidoExistente.get();
            UsuarioModel usuario = usuarioRepository.findById(pedidoDTO.usuario_id())
                    .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado"));
            pedido.setUsuario(usuario);
            pedido.setTotalPedido(pedidoDTO.totalPedido());
            pedido.setDataPedido(new Date()); // Atualiza a data do pedido, se necessário

            return pedidoRepository.save(pedido);
        } else {
            throw new EntityNotFoundException("Pedido não encontrado");
        }
    }

    // LISTAR PEDIDOS
    @Transactional
    public List<PedidoModel> listarPedidos() {
        return pedidoRepository.findAll();
    }

    // EXCLUIR PEDIDO
    @Transactional
    public void excluirPedido(Long codigoPedido) {
      PedidoModel pedido = pedidoRepository.findById(codigoPedido).orElseThrow(() -> new EntityNotFoundException(("Pedido não encontrado")));
      pedidoRepository.delete(pedido);

    }

    // BUSCAR PEDIDO POR ID
    @Transactional
    public PedidoModel buscarPedidoPorId(Long codigoPedido) {
        return pedidoRepository.findById(codigoPedido).orElseThrow(() -> new EntityNotFoundException("Pedido não encontrado"));
    }

}