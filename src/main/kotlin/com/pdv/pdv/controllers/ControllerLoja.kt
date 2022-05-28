package com.pdv.pdv.controllers

import com.pdv.pdv.models.ModelLoja
import com.pdv.pdv.services.ServiceLoja
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("loja")
class ControllerLoja(
 val serviceLoja: ServiceLoja
) {
    @PostMapping
    fun cadastrarLoja(@RequestBody modelLoja: ModelLoja){
        serviceLoja.cadastrarLoja(modelLoja)
    }
}