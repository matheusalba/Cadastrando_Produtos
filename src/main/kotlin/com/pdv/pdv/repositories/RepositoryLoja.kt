package com.pdv.pdv.repositories

import com.pdv.pdv.models.ModelLoja
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository interface RepositoryLoja:JpaRepository<ModelLoja, Long> {
}