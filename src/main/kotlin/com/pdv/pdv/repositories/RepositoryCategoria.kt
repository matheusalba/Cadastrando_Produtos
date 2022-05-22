package com.pdv.pdv.repositories

import com.pdv.pdv.models.ModelCategoria
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository interface RepositoryCategoria : JpaRepository<ModelCategoria, Long> {}