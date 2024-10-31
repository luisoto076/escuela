package com.escuela.service;
import com.escuela.model.*;
import com.escuela.repository.GrupoRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GrupoService {

    private GrupoRepository grupoRepository = new GrupoRepository();
    public Grupo crearGrupo(long idGrupo, String horario,  Profesor profesor, Asignatura asignatura, Collection<Estudiante> estudiantes){
        ArrayList<Evaluacion> listaEvaluacion = new ArrayList<>();
        for(Estudiante estudiante: estudiantes){
           Evaluacion evaluacion = new Evaluacion(estudiante,0.0f, "");
           listaEvaluacion.add(evaluacion);
        }
        Grupo grupo = new Grupo(idGrupo, profesor, listaEvaluacion, horario, asignatura);
        grupoRepository.guardar(grupo);
        return grupo;
    }

    public Grupo crearGrupo(String[] tokensGrupo){
        return crearGrupo(
                Long.parseLong(tokensGrupo[0]),
                tokensGrupo[1]
        );
    }
    public List<Grupo> obteneTodosLosGrupos(){
        return grupoRepository.obtenerTodosLosGrupos();
    }

    public Grupo crearGrupo(long idGrupo, String horario){
        Grupo grupo = new  Grupo(idGrupo,horario);
        grupoRepository.guardar(grupo);
        return grupo;
    }

    public Grupo agregaEstudiante(Grupo grupo, Estudiante estudiante){
        grupo.getLista().add(new Evaluacion(estudiante, 0.0f, ""));
        return grupo;
    }

}
