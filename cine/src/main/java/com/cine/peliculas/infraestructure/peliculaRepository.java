package com.cine.peliculas.infraestructure;

import java.util.List;


import com.cine.peliculas.domain.models.Pelicula;

public interface peliculaRepository {
    void save(Pelicula pelicula);
    void update(Pelicula pelicula);
    void delete(int id);
    static List<Pelicula> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
}
