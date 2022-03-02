/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.upiicsa.ejemploequipo.alumno;

import com.upiicsa.ejemploequipo.materia.Materia;
import java.util.ArrayList;

/**
 *
 * @author Cris
 */
public class AlumnoDB extends Alumno{
    private String nombreDB;

    public AlumnoDB(String nombreDB, String nombre, String primerApellido, String segundoApellido, String boleta, ArrayList<Materia> materias) {
        super(nombre, primerApellido, segundoApellido, boleta, materias);
        this.nombreDB = nombreDB;
    }

    public String getNombreDB() {
        return nombreDB;
    }

    public void setNombreDB(String nombreDB) {
        this.nombreDB = nombreDB;
    }

    

    public int guardarAlumno(Alumno alumno){
        //GUARDAR EL ALUMNO EN LA DB
        return 1;
    }
    
}
