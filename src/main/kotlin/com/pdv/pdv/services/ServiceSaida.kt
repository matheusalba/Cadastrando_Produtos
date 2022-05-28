package com.pdv.pdv.services

import com.pdv.pdv.models.ModelSaida
import com.pdv.pdv.repositories.RepositorySaida
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service

@Service
class ServiceSaida(
    val repositorySaida: RepositorySaida
) {
    fun cadastrarSaida( saida: ModelSaida){
        repositorySaida.save(saida)
    }
}