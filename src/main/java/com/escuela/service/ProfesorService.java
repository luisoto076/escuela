package com.escuela.service;

import com.escuela.model.Profesor;
import com.escuela.model.Usuario;

public class ProfesorService {

    private static final String foto = "foto.png";
    private static final String ROLPROFESOR = "PROFESOR";
    public Profesor creaProfesor(String nombre, String correo, String password){
        return new Profesor(nombre, new Usuario(correo, password, ROLPROFESOR), foto);
    }

    //tokensProfesor -> {{Juan Perez},{juanperez@correo.com},{1234}}
    public Profesor creaProfesor(String[] tokensProfesor){
        return creaProfesor(
                tokensProfesor[0],
                tokensProfesor[1],
                tokensProfesor[2]
        );
    }

}
