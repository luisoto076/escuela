package com.escuela.service;

import com.escuela.model.Profesor;
import com.escuela.model.Usuario;
import com.escuela.repository.ProfesorRepository;

import java.util.List;

public class ProfesorService {

    private static final String foto = "foto.png";
    private static final String ROLPROFESOR = "PROFESOR";
    private ProfesorRepository profesorRepository = new ProfesorRepository();

    public Profesor creaProfesor(String nombre, String correo, String password) {
        Profesor profesor = new Profesor(nombre, new Usuario(correo, password, ROLPROFESOR), foto);
        profesorRepository.guardar(profesor);
        return profesor;
    }

    public List<Profesor> obtenerTodoProfesor() {
        return profesorRepository.obtenerTodosProfesores();
    }

    //tokensProfesor -> {{Juan Perez},{juanperez@correo.com},{1234}}
    public Profesor creaProfesor(String[] tokensProfesor) {
        return creaProfesor(
                tokensProfesor[0],
                tokensProfesor[1],
                tokensProfesor[2]
        );
    }
}