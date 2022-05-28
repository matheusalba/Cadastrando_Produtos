package com.pdv.pdv.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="compra")
class ModelCompra (
    @Id
    @GeneratedValue
    var id : Long = 0,
    var forma_pag : String = ""

)