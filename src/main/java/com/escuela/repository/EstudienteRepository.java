package com.escuela.repository;

import com.escuela.model.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class EstudienteRepository {
    List<Estudiante> base = new ArrayList<>();

    public void guardar(Estudiante estudiante){
        base.add(estudiante);
    }

    public Estudiante obtenEstudiantePorNombre(String nombre){
        for(Estudiante estudiante: base){
            if(estudiante.getNombre().equals(nombre)){
                return estudiante;
            }
        }
        return null;
    }

    public Estudiante obtenEstudiantePorMatricula(String matricula){
        for(Estudiante estudiante: base){
            if(estudiante.getMatricula().equals(matricula)){
                return estudiante;
            }
        }
        return null;
    }

    public Estudiante obtenEstudiantePorCorreo(){
        return null;
    }


}
