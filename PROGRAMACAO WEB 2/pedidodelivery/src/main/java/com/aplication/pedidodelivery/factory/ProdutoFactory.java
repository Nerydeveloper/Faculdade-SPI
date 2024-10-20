package com.aplication.pedidodelivery.factory;

import com.aplication.pedidodelivery.dto.ProdutoDTO;
import com.aplication.pedidodelivery.entities.ProdutoModel;
import org.springframework.stereotype.Component;

@Component
public class ProdutoFactory {
    public ProdutoModel createProduto(ProdutoDTO produtoDTO) {
        ProdutoModel produtoModel = new ProdutoModel();
        produtoModel.setNomeProduto(produtoDTO.nomeProduto());
        produtoModel.setDescricaoProduto(produtoDTO.descricaoProduto());
        produtoModel.setPrecoProduto(produtoDTO.precoProduto());

        return produtoModel;
    }
}
