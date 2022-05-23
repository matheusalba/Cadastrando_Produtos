package com.pdv.pdv.repositories

import com.pdv.pdv.models.ModelProduto
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository interface RepositoryProduto : JpaRepository<ModelProduto, Long> {
    @Query("select p.pais_origem, \n" +
            "sum(p.preco_venda - p.preco_custo) \n" +
            "from produto p\n" +
            "group by p.pais_origem", nativeQuery = true)
    fun valorProdutoPais():List<*>


}