/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.upiicsa.ejemploequipo.academia;

import com.upiicsa.ejemploequipo.profesor.Profesor;
import java.util.ArrayList;

/**
 *
 * @author Cris
 */
public class Academia extends Profesor{
    
    private String nombreAcademia;
    private String responsable;
    private String materia;
    private ArrayList<Profesor> profesores;

    public Academia(String nombreAcademia, String responsable, String materia, ArrayList<Profesor> profesores, String nombreProfe, String primerApellido, String segundoApellido, String cedula, String fechaNacimiento) {
        super(nombreProfe, primerApellido, segundoApellido, cedula, fechaNacimiento);
        this.nombreAcademia = nombreAcademia;
        this.responsable = responsable;
        this.materia = materia;
        this.profesores = profesores;
    }

    public String getNombreAcademia() {
        return nombreAcademia;
    }

    public void setNombreAcademia(String nombreAcademia) {
        this.nombreAcademia = nombreAcademia;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }
    
    
}
