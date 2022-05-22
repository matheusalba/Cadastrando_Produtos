package com.pdv.pdv.extensions

import com.pdv.pdv.models.ModelCategoria
import com.pdv.pdv.models.ModelProduto
import com.pdv.pdv.requests.RequestCategoria
import com.pdv.pdv.requests.RequestProduto
import com.pdv.pdv.services.ServiceProduto

fun RequestProduto.toProduto():ModelProduto{
    return ModelProduto(
        id_categoria = this.id_categoria,
        nome = this.nome,
        preco_custo = this.preco_custo,
        preco_venda = this.preco_venda,
        data_estoque = this.data_estoque,
        pais_origem = this.pais_origem,
        fornecedor = this.fornecedor
        )
}

fun RequestCategoria.toCategoria(): ModelCategoria {
    return ModelCategoria(nome  = this.nome)
}
