package com.pdv.pdv.controllers

import com.pdv.pdv.extensions.toCategoria
import com.pdv.pdv.requests.RequestCategoria
import com.pdv.pdv.services.ServiceCategoria
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("categoria")
class ControllerCategoria(
    val serviceCategoria: ServiceCategoria
) {

    @PostMapping
    fun cadastrarCategoria(@RequestBody requestCategoria: RequestCategoria){
        serviceCategoria.cadastrarCategoria(requestCategoria.toCategoria())
    }

    @GetMapping("todas/custom")
    fun mediaCustoCategoria(){
        serviceCategoria.mediaCustoCategoria()
    }
}