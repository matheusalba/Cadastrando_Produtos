package com.pdv.pdv.services

import com.pdv.pdv.models.ModelLoja
import com.pdv.pdv.repositories.RepositoryLoja
import org.springframework.stereotype.Service

@Service
class ServiceLoja(
 val repositoryLoja: RepositoryLoja
) {
    fun cadastrarLoja(modelLoja: ModelLoja){
        repositoryLoja.save(modelLoja)
    }
}