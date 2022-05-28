package com.pdv.pdv.controllers

import com.pdv.pdv.models.ModelCompra
import com.pdv.pdv.services.ServiceCompra
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("compra")
class ControllerCompra(
    val serviceCompra: ServiceCompra
) {
    @PostMapping
    fun cadastrarCompra(@RequestBody compra: ModelCompra){
        serviceCompra.cadastrarCompra(compra)
    }

    @GetMapping("/{id}")
    fun compraPorId(@PathVariable id:Long){
        serviceCompra.compraPorId(id)
    }
}