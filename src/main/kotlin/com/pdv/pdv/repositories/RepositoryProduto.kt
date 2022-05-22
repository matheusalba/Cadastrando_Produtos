package com.pdv.pdv.repositories

import com.pdv.pdv.models.ModelProduto
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository interface RepositoryProduto : JpaRepository<ModelProduto, Long> {}