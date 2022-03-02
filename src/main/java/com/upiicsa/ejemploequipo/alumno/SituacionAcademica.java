/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.upiicsa.ejemploequipo.alumno;

/**
 *
 * @author Cris
 */
public class SituacionAcademica {
    
    private String semestre;
    private double creditosActuales;
    private double promedio;
    private String tipoAlumno;

    public SituacionAcademica(String semestre, double creditosActuales, double promedio, String tipoAlumno) {
        this.semestre = semestre;
        this.creditosActuales = creditosActuales;
        this.promedio = promedio;
        this.tipoAlumno = tipoAlumno;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public double getCreditosActuales() {
        return creditosActuales;
    }

    public void setCreditosActuales(double creditosActuales) {
        this.creditosActuales = creditosActuales;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getTipoAlumno() {
        return tipoAlumno;
    }

    public void setTipoAlumno(String tipoAlumno) {
        this.tipoAlumno = tipoAlumno;
    }
    
    
}
