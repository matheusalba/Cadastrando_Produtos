package com.pdv.pdv.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="categoria")
class ModelCategoria (
    @Id
    @GeneratedValue
    var id :Long = 0,
    var nome :String =""
)