package com.pdv.pdv.services

import com.pdv.pdv.extensions.toProduto
import com.pdv.pdv.models.ModelProduto
import com.pdv.pdv.repositories.RepositoryCategoria
import com.pdv.pdv.repositories.RepositoryProduto
import com.pdv.pdv.requests.RequestProduto
import org.springframework.stereotype.Service

@Service
class ServiceProduto(
val repositoryProduto: RepositoryProduto,
val repositoryCategoria: RepositoryCategoria
) {
    fun cadastrarProduto(requestProduto:RequestProduto):String{
        if(repositoryCategoria.existsById(requestProduto.id_categoria.toLong())){
            repositoryProduto.save(requestProduto.toProduto())
            return "cadastrado"
        }
            return "categoria não existe"
    }
}