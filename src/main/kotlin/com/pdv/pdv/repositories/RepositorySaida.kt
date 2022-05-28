package com.pdv.pdv.repositories

import com.pdv.pdv.models.ModelSaida
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository interface RepositorySaida: JpaRepository<ModelSaida, Long> {
}