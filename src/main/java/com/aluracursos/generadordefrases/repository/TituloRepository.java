package com.aluracursos.generadordefrases.repository;

import com.aluracursos.generadordefrases.dto.TituloDTO;
import com.aluracursos.generadordefrases.model.Titulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TituloRepository extends JpaRepository<Titulo, Long> {

    @Query("SELECT t FROM Titulo t ORDER BY function('RANDOM') LIMIT 1")
    public Titulo seleccionarFraseAleatoria();
}
