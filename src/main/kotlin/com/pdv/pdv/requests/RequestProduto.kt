package com.pdv.pdv.requests

import java.text.DateFormat
import java.time.LocalDate
import java.util.*

class RequestProduto(
    var id_categoria :Long,
    var nome:String,
    var preco_custo:Double,
    var preco_venda:Double,
    var data_estoque: Date,
    var pais_origem: String,
    var fornecedor: String
    )