package com.cine;

import com.cine.peliculas.adapters.in.PeliculaConsoleAdapter;
import com.cine.peliculas.adapters.out.PeliculamySQLRepository;
import com.cine.peliculas.application.peliculaService;

public class Main {
    
    public static void main(String[] args) {
        PeliculamySQLRepository sqlPelicula = new PeliculamySQLRepository("jdbc:mysql://localhost:3306/cineCampus", "campus2023", "campus2023");
        peliculaService ps = new peliculaService(sqlPelicula);
        PeliculaConsoleAdapter console = new PeliculaConsoleAdapter(ps);
        console.start();

}
}