package com.cine.peliculas.adapters.in;

import java.util.Scanner;

import com.cine.peliculas.application.peliculaService;
import com.cine.peliculas.domain.models.Pelicula;

public class PeliculaConsoleAdapter {
    private final peliculaService peliculaService;

    

    public PeliculaConsoleAdapter(com.cine.peliculas.application.peliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar Película");
            System.out.println("2. Editar Película.");
            System.out.println("3. Eliminar Película");
            System.out.println("4. Listar Películas");
            System.out.println("5. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Ingrese el id de la pelicula: ");
                    int createId= scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el codigo interno de la pelicula: ");
                    String createCodInterno = scanner.nextLine();

                    System.out.print("Ingrese el nombre de la pelicula: ");
                    String createName = scanner.nextLine();
                    
                    System.out.print("Ingrese la duración de la pelicula: ");
                    String createDuracion = scanner.nextLine();

                    System.out.print("Ingrese la sinopsis de la pelicula: ");
                    String createSinopsis = scanner.nextLine();

                    Pelicula newPelicula = new Pelicula(createId, createCodInterno, createName, createDuracion, createSinopsis);
                    peliculaService.createPelicula(newPelicula);
                    break;

                case 2:
                    System.out.print("Ingrese el ID a actualizar: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nuevo código interno: ");
                    String updatecodinterno= scanner.nextLine();

                    System.out.print("Ingrese el nuevo nombre interno: ");
                    String updateNombre= scanner.nextLine();

                    System.out.print("Ingrese la nueva duración: ");
                    String updateDuracion= scanner.nextLine();

                    System.out.print("Ingrese la nueva sinopsis: ");
                    String updateSinopsis= scanner.nextLine();

                
                    Pelicula updatedPelicula = new Pelicula(updateId, updatecodinterno, updateNombre, updateDuracion, updateSinopsis);
                    peliculaService.updatepelicula(updatedPelicula);
                    break;

                case 3:
                    System.out.print("Ingrese el Id de la pelicula a borrar: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    peliculaService.deletepelicula(deleteId);
                    break;

                case 4:
                    peliculaService.getAllpeliculaes().forEach(p -> {
                    System.out.println("ID: " + p.getId() + ", Nombre: " + p.getNombre());
                });
                break;

                case 5:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida, intentelo de nuevo.");
            }
        }
    }
}

