package com.pdv.pdv.repositories

import com.pdv.pdv.models.ModelCategoria
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import javax.persistence.Tuple

@Repository interface RepositoryCategoria : JpaRepository<ModelCategoria, Long> {


}