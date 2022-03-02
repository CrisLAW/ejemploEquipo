/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.upiicsa.ejemploequipo.grupo;

/**
 *
 * @author Cris
 */
public class Grupo {
    
    private String nombre;
    private int noIntegrantes;
    private int maxAlumnos;

    public Grupo(String nombre, int noIntegrantes, int maxAlumnos) {
        this.nombre = nombre;
        this.noIntegrantes = noIntegrantes;
        this.maxAlumnos = maxAlumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNoIntegrantes() {
        return noIntegrantes;
    }

    public void setNoIntegrantes(int noIntegrantes) {
        this.noIntegrantes = noIntegrantes;
    }

    public int getMaxAlumnos() {
        return maxAlumnos;
    }

    public void setMaxAlumnos(int maxAlumnos) {
        this.maxAlumnos = maxAlumnos;
    }
    
    
}
