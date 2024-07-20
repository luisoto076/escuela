package com.escuela.model;

public class Asignatura {
    private String nombre;
    private int creditos;
    private String nivel;
    private String grado;

    public Asignatura(){}

    public Asignatura(String nombre, int creditos, String nivel, String grado){
        this.nombre = nombre;
        this.creditos = creditos;
        this.nivel = nivel;
        this.grado = grado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
