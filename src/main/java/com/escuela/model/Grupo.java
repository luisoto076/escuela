package com.escuela.model;

import java.util.ArrayList;
import java.util.Collection;

public class Grupo {
    private long idGrupo;
    private Profesor profesor;
    private Collection<Evaluacion> lista;
    private String horario;
    private Asignatura asignatura;

    public Grupo(){}

    public Grupo(long idGrupo, Profesor profesor, Collection<Evaluacion> lista, String horario, Asignatura asignatura){
        this.idGrupo = idGrupo;
        this.profesor = profesor;
        this.lista = lista;
        this.horario = horario;
        this.asignatura = asignatura;
    }

    public Grupo(long idGrupo, String horario){
        this.idGrupo = idGrupo;
        this.horario = horario;
        this.lista = new ArrayList<>();
    }

    public long getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(long idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Collection<Evaluacion> getLista() {
        return lista;
    }

    public void setLista(Collection<Evaluacion> lista) {
        this.lista = lista;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public String toString(){
        return String.format("%d,%s,\n", idGrupo,horario);
    }
}
