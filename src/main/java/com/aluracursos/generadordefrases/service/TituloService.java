package com.aluracursos.generadordefrases.service;

import com.aluracursos.generadordefrases.dto.TituloDTO;
import com.aluracursos.generadordefrases.model.Titulo;
import com.aluracursos.generadordefrases.repository.TituloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TituloService {
    @Autowired
    private TituloRepository repository;

    public TituloDTO fraseAleatoria(){
        Titulo titulo = repository.seleccionarFraseAleatoria();
        return new TituloDTO(titulo.getFrase(), titulo.getPersonaje(), titulo.getTitulo(), titulo.getPoster());
    }
}
