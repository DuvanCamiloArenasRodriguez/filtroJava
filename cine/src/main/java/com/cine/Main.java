package com.cine;

import java.util.Scanner;

import com.cine.actores.adapters.in.ActorConsoleAdapter;
import com.cine.actores.adapters.out.ActormySQLRepository;
import com.cine.actores.application.ActorService;
import com.cine.actores.domain.models.Actor;
import com.cine.peliculas.adapters.in.PeliculaConsoleAdapter;
import com.cine.peliculas.adapters.out.PeliculamySQLRepository;
import com.cine.peliculas.application.peliculaService;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Señor usuario: Seleccione una opción: ");
        System.out.println("1. Gestión de películas");
        System.out.println("2. Gestión de actores");
        String option = sc.nextLine();
        
        switch (option) {
            case "1":
                PeliculamySQLRepository sqlPelicula = new PeliculamySQLRepository("jdbc:mysql://localhost:3306/cineCampus", "root", "123456");
                peliculaService ps = new peliculaService(sqlPelicula);
                PeliculaConsoleAdapter console = new PeliculaConsoleAdapter(ps);
                console.start();
                break;
            case "2":
                ActormySQLRepository sqlActor = new ActormySQLRepository("jdbc:mysql://localhost:3306/cineCampus", "root", "123456");
                ActorService ps2 = new ActorService(sqlActor);
                ActorConsoleAdapter console2 = new ActorConsoleAdapter(ps2);
                console2.start();
            default:
                break;
        }
        
}
}