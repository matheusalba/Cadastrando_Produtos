package com.pdv.pdv.services


import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.pdv.pdv.models.ModelCompra
import com.pdv.pdv.repositories.RepositoryCompra
import org.springframework.stereotype.Service

@Service
class ServiceCompra(
    val repositoryCompra: RepositoryCompra
) {
    fun cadastrarCompra(compra: ModelCompra){
        repositoryCompra.save(compra)
    }

    fun compraPorId(id:Long){
        val mapper = jacksonObjectMapper()
        val lista = repositoryCompra.compraPorId(id)
        val r = mapper.writeValueAsString(lista)
        println(r)


    }
}