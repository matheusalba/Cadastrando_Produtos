package com.pdv.pdv.services

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.pdv.pdv.models.ModelCategoria
import com.pdv.pdv.repositories.RepositoryCategoria
import org.springframework.stereotype.Service

@Service
class ServiceCategoria(
val repositoryCategoria: RepositoryCategoria
) {
     fun cadastrarCategoria(categoria: ModelCategoria){
          repositoryCategoria.save(categoria)
     }

     fun mediaCustoCategoria(){
          val mapper = jacksonObjectMapper()
          val lista = repositoryCategoria.mediaCustoCategoria()
          val r = mapper.writeValueAsString(lista)
          println(r)
     }
}