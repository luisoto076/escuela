package com.escuela.service;

import com.escuela.model.*;

import java.util.ArrayList;
import java.util.Collection;

public class GrupoService {

    public Grupo crearGrupo(long idGrupo, String horario,  Profesor profesor, Asignatura asignatura, Collection<Estudiante> estudiantes){
        ArrayList<Evaluacion> listaEvaluacion = new ArrayList<>();
        for(Estudiante estudiante: estudiantes){
           Evaluacion evaluacion = new Evaluacion(estudiante,0.0f, "");
           listaEvaluacion.add(evaluacion);
        }
        return new Grupo(idGrupo, profesor, listaEvaluacion, horario, asignatura);
    }

    public Grupo agregaEstudiante(Grupo grupo, Estudiante estudiante){
        grupo.getLista().add(new Evaluacion(estudiante, 0.0f, ""));
        return grupo;
    }

}
