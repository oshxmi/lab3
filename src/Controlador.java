//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example.Controller;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import org.example.Beans.Artista;

public class Controlador {
    public Controlador() {
    }

    public void registrarNuevoEquipo(ArrayList<Equipo> equipos) {
        Scanner scanner = new Scanner(System.in);
        Equipo artista = new Equipo();
        System.out.print("Nombre: ");
        artista.setNombre(scanner.nextLine());
        System.out.print("Numero de jugadores: ");
        artista.setNumeroJugadores(scanner.nextLine());
        System.out.print("Nombre DT:");
        artista.setNombreDiTe(scanner.nextLine());
        equipos.add(Equipo);
    }

    public void listarArtistas(ArrayList<Equipo> Equipos) {
        for(Equipo artista : equipos) {
            PrintStream var10000 = System.out;
            String var10001 = equipo.getNombre();
            var10000.println("Nombre: " + var10001 + "| Grupo: " + equipo.getNumeroJugadores() + "| Instrumento: " + artista.getNombreDiTe());
        }

    }
}
