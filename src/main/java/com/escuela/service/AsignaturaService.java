package com.escuela.service;

import com.escuela.model.Asignatura;

public class AsignaturaService {

    public Asignatura creaAsignatura(String nombre, int creditos, String nivel, String grado){
        return new Asignatura(nombre, creditos, nivel, grado);
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
