package com.pdv.pdv.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="saida")
class ModelSaida (
    @Id
    @GeneratedValue
    var id : Long = 0,
    var id_loja : Long = 0,
    var id_produto : Long = 0,
    var id_compra : Long = 0
    )