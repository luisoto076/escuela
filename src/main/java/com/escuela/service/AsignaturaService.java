package com.escuela.service;

import com.escuela.model.Asignatura;
import com.escuela.repository.AsignaturaRepository;

import java.util.List;

public class AsignaturaService {

    private AsignaturaRepository asignaturaRepository = new AsignaturaRepository();
    public Asignatura creaAsignatura(String nombre, int creditos, String nivel, String grado){
        Asignatura asignatura = new Asignatura(nombre, creditos, nivel, grado);
        asignaturaRepository.guardar(asignatura);
        return asignatura;
    }

    public List<Asignatura> obtenerTodasAsignaturas(){
        return asignaturaRepository.obtenerTodasAsignaturas();
    }

    /*
    * ingresa la asignatura
    * # Matematicas, 10, Preparatoria, 4t0
    *
    * {{Matem},{10},{Pre},{4to}}
    *
    * */

    public Asignatura creaAsignatura(String[] tokensAsignatura){
        return  creaAsignatura(
                tokensAsignatura[0],
                Integer.parseInt(tokensAsignatura[1]),
                tokensAsignatura[2],
                tokensAsignatura[3]
        );
    }

}
