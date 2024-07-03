package com.cine.peliculas.application;

import com.cine.peliculas.domain.models.Pelicula;

import com.cine.peliculas.infraestructure.peliculaRepository;

import java.util.List;

public class peliculaService {
    private final peliculaRepository peliculaRepository;

    public peliculaService(peliculaRepository peliculaRepository) {
        this.peliculaRepository = peliculaRepository;
    }

    public void createPelicula(Pelicula pelicula) {
        peliculaRepository.save(pelicula);
    }

    public void updatepelicula(Pelicula pelicula) {
        peliculaRepository.update(pelicula);
    }

    public void deletepelicula(int id) {
        peliculaRepository.delete(id);
    }

    public List<Pelicula> getAllpeliculaes() {
        return com.cine.peliculas.infraestructure.peliculaRepository.findAll();
    }
}





