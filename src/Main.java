package org.example;
import java.util.Scanner;
import java.util.ArrayList;
import ...

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        ArrayList<Equipo> listaEquipos = new ArrayList();
        boolean estado = true;

        while(estado) {
            switch (menuPrincipal()) {
                case "1":
                    System.out.println("\n Registro de equipos");
                    System.out.println("**************************");
                    appController.registrarNuevoEquipo(listaEquipos);
                    break;
                case "2":
                    System.out.println("\n Sorteo de llaves");
                    System.out.println("************************");
                    appController.listarArtistas(listaArtista);
                    break;
                case "3":
                    System.out.println("\n Colocar Resultados");
                    System.out.println("************************");
                    appController.listarResultados(listaArtista);
                    break;
                case "4":
                    System.out.println("\n Imprimir Resultados");
                    System.out.println("************************");
                    appController.listarArtistas(listaArtista);
                    break;
                case "5":
                    estado = false;
                    System.out.println("Salir");
                default:
                    System.out.println("\n Debe ingresar una opción válida");
            }
        }

    }

    public static String menuPrincipal() {
        Scanner scan = new Scanner(System.in);
        System.out.println("****** Bienvenido al Menu de IWEB *********");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("| 1 <- Registro equipos                   |");
        System.out.println("| 2 <- Sorteo de llaves                   |");
        System.out.println("| 3 <- Colocar Resultados                 |");
        System.out.println("| 4 <- Imprimir Resultados                |");
        System.out.println("| 5 <- Salir                              |");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Ingrese opcion: ");
        return scan.nextLine();
    }
}