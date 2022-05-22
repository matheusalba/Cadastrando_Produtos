package com.pdv.pdv.controllers

import com.pdv.pdv.extensions.toProduto
import com.pdv.pdv.models.ModelProduto
import com.pdv.pdv.requests.RequestProduto
import com.pdv.pdv.services.ServiceProduto
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("produto")
class ControllerProduto(
    val serviceProduto: ServiceProduto
) {

    @PostMapping
    fun cadastrarProduto(@RequestBody requestProduto:RequestProduto):String{
        return serviceProduto.cadastrarProduto(requestProduto)
    }

}