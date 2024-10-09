package com.escuela.repository;

import com.escuela.model.Profesor;

import java.util.ArrayList;
import java.util.List;

public class ProfesorRepository {
    List <Profesor> base = new ArrayList<>();

    public List<Profesor> obtenerTodosProfesores(){
        return base;
    }

    public void guardar(Profesor profesor){
        base.add(profesor);
    }
}
