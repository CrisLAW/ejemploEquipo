/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.upiicsa.ejemploequipo.materia;

/**
 *
 * @author Cris
 */
public class Materia {
    
    private String nombre;
    private String horario;
    private float creditos;

    public Materia(String nombre, String horario, float creditos) {
        this.nombre = nombre;
        this.horario = horario;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public float getCreditos() {
        return creditos;
    }

    public void setCreditos(float creditos) {
        this.creditos = creditos;
    }
    
    
}
