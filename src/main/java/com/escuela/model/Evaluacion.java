package com.escuela.model;

public class Evaluacion {
    private Estudiante estudiante;
    private float calificacion;
    private String observaciones;


    public Evaluacion(){}

    public Evaluacion(Estudiante estudiante, float calificacion, String observaciones){
        this.estudiante = estudiante;
        this.calificacion = calificacion;
        this.observaciones = observaciones;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
