package com.aluracursos.generadordefrases.controller;

import com.aluracursos.generadordefrases.dto.TituloDTO;
import com.aluracursos.generadordefrases.model.Titulo;
import com.aluracursos.generadordefrases.service.TituloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TituloController {

    @Autowired
    TituloService servicio;

    @GetMapping("/series/frases")
    public TituloDTO obtenerFraseAleatoria(){
        return servicio.fraseAleatoria();
    }
}
