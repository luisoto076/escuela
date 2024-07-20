package com.escuela.service;

import com.escuela.model.Estudiante;
import com.escuela.model.Usuario;
import com.escuela.repository.EstudienteRepository;

public class EstudianteService {

    private static final String foto = "foto.png";
    private static final String ROLESTUDIANTE = "ESTUDIANTE";

    private EstudienteRepository estudianteRepository = new EstudienteRepository();

    public Estudiante creaEstudiante(String nombre, String correo, String password, String matricula){
        Estudiante estudiante = new Estudiante(nombre, new Usuario(correo, password, ROLESTUDIANTE), foto, matricula);
        estudianteRepository.guardar(estudiante);
        return estudiante;
    }

    public Estudiante creaEstudiante(String[] tokensEstudiante){
        return creaEstudiante(
                tokensEstudiante[0],
                tokensEstudiante[1],
                tokensEstudiante[2],
                tokensEstudiante[3]
        );
    }

    public Estudiante obtenEstudiantePorMatricula(String matricula){
        return estudianteRepository.obtenEstudiantePorMatricula(matricula);
    }

}
