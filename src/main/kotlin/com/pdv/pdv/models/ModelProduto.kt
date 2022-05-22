package com.pdv.pdv.models

import java.sql.Timestamp
import java.text.DateFormat
import java.time.LocalDate
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="produto")
data class ModelProduto(
    @Id
    @GeneratedValue
    var id : Int = 0,
    var id_categoria: Long = 0,
    var nome: String = "",
    var preco_custo: Double = 0.0,
    var preco_venda: Double = 0.0,
    var data_estoque: Date = Date(),
    var pais_origem: String = "",
    var fornecedor : String =""

    )