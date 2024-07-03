package com.cine.actores.adapters.in;

import java.util.Scanner;

import com.cine.actores.application.ActorService;
import com.cine.actores.domain.models.Actor;

public class ActorConsoleAdapter {
    private final ActorService actorService;

    public ActorConsoleAdapter(ActorService actorService) {
        this.actorService = actorService;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Actor");
            System.out.println("2. Actualizar Actor");
            System.out.println("3. Eliminar Actor");
            System.out.println("4. Listar todos los Actores");
            System.out.println("5. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            opciones: switch (choice) {
                case 1:
                    System.out.print("Ingrese el nombre del actor: ");
                    String createName = scanner.nextLine();
                    System.out.print("Ingrese el ID de nacionalidad: ");
                    int createNacionalidad = scanner.nextInt();
                    System.out.print("Ingrese la edad del actor: ");
                    int createEdad = scanner.nextInt();
                    System.out.print("Ingrese el ID del genero: ");
                    int createGenero = scanner.nextInt();
                    scanner.nextLine();

                    Actor newActor = new Actor(createNacionalidad, createName, createNacionalidad, createEdad, createGenero);
                    actorService.createActor(newActor);
                    break;

                case 2:
                    System.out.print("Ingrese el ID a actualizar: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nuevo nombre: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Ingrese el nuevo ID de nacionalidad: ");
                    int updateNacionalidad = scanner.nextInt();
                    System.out.print("Ingrese la nueva edad: ");
                    int updateEdad = scanner.nextInt();
                    System.out.print("Ingrese el nuevo ID del genero: ");
                    int updateGenero = scanner.nextInt();
                    scanner.nextLine();

                    Actor updatedActor = new Actor(updateId, updateName, updateNacionalidad, updateEdad, updateGenero);
                    actorService.updateActor(updatedActor);
                    break;

                case 3:
                    System.out.print("Ingrese el Id del actor a borrar: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    actorService.deleteActor(deleteId);
                    break;

                case 4:
                    actorService.getAllActores().forEach(a -> {
                        System.out.println("ID: " + a.getId() + ", Nombre: " + a.getNombre() + 
                                        ", Nacionalidad: " + a.getIdNacionalidad() + 
                                        ", Edad: " + a.getEdad() + ", Género: " + a.getIdGenero());
                    });
                    break;

                case 5:
                    scanner.close();
                    System.exit(0);
                    break opciones;

                default:
                    System.out.println("Opcion invalida, intentelo de nuevo.");
            }
        }
    }
}

