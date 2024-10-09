package com.escuela.repository;

import com.escuela.model.Asignatura;

import java.util.ArrayList;
import java.util.List;

public class AsignaturaRepository {
    List<Asignatura> base = new ArrayList<>();

    public List<Asignatura> obtenerTodasAsignaturas(){
        return base;
    }

    public void  guardar(Asignatura asignatura){
        base.add(asignatura);
    }
}
