package com.pdv.pdv.repositories

import com.pdv.pdv.models.ModelCompra
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import javax.persistence.Tuple

@Repository interface RepositoryCompra :JpaRepository<ModelCompra, Long> {

    @Query("select \n" +
            "pro.nome \n" +
            "from compra com\n" +
            "inner join saida sad on sad.id_compra = com.id \n" +
            "inner join produto pro on pro.id = sad.id_produto \n" +
            "where com.id = :id", nativeQuery = true)
    fun compraPorId(
        @Param("id") id:Long
    ):List<*>

}