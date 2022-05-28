package com.pdv.pdv.controllers

import com.pdv.pdv.models.ModelSaida
import com.pdv.pdv.services.ServiceSaida
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("saida")
class ControllerSaida(
    val serviceSaida:ServiceSaida
)
{
    @PostMapping
    fun cadastrarSaida(@RequestBody saida: ModelSaida){
        serviceSaida.cadastrarSaida(saida)
    }
}