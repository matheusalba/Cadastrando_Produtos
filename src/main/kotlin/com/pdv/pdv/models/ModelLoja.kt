package com.pdv.pdv.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="loja")
class ModelLoja (
    @Id
    @GeneratedValue
    var id :Long = 0,
    var nome : String = "",
    var cidade : String = "",
    var bairro : String = "",
    var estado : String = ""
    )