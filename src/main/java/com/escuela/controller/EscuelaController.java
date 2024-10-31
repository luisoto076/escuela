package com.escuela.controller;

import com.escuela.model.Asignatura;
import com.escuela.model.Estudiante;
import com.escuela.model.Grupo;
import com.escuela.model.Profesor;
import com.escuela.service.AsignaturaService;
import com.escuela.service.EstudianteService;
import com.escuela.service.GrupoService;
import com.escuela.service.ProfesorService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EscuelaController {
    AsignaturaService asignaturaService = new AsignaturaService();
    ProfesorService profesorService = new ProfesorService();
    EstudianteService estudianteService = new EstudianteService();
    GrupoService grupoService = new GrupoService();
    Scanner sc = new Scanner(System.in);

    public String leeDatos(String mensaje){
        System.out.println(mensaje);
        return sc.nextLine();
    }

    public Estudiante leeEstudiante(){
        String cadenaEstudiante = leeDatos("Ingesa los datos del estudiante\nNOMBRE,CORREO,PASSWOR,MATRICULA"); // "Luis Soto, 3110025976"
        Estudiante estudiante = estudianteService.creaEstudiante(cadenaEstudiante.split(",")); // ["Luis Soto", "3110259765"]
        return  estudiante;
    }

    public Asignatura leeAsignatura(){
        String cadenaAsignatura = leeDatos("Ingresa los datos de la asignatura\nNOMBRE,CREDITOS,NIVEL,GRADO");
        Asignatura asignatura = asignaturaService.creaAsignatura(cadenaAsignatura.split(","));
        return asignatura;
    }

    public Profesor leeProfesor(){
        String cadenaProfesor = leeDatos("Ingresa los datos del profesor\nNOMBRE,CORREO,PASSWORD");
        Profesor profesor = profesorService.creaProfesor(cadenaProfesor.split(","));
        return profesor;
    }

    public Grupo leeGrupo(){
        String cadenaGrupo = leeDatos("Ingresa los datos del grupo\nID,HORARIO");
        Grupo grupo = grupoService.crearGrupo(cadenaGrupo.split(","));
        return grupo;
    }

    public List<Estudiante> obtenerTodosEstudiantes(){
        return estudianteService.obtenerTodosEstudiantes();
    }

    public List<Profesor> obtenerTodosProfesores(){
        return profesorService.obtenerTodoProfesor();
    }

    public List<Asignatura> obtenerTodasAsignaturas(){
        return asignaturaService.obtenerTodasAsignaturas();
    }

    public List<Grupo> obtenerTodosLosGrupos(){
        return grupoService.obteneTodosLosGrupos();
    }


    /*public Grupo creaGrupo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al asistente para crear Grupos");
        String asignaturaCadena = leeDatos(scerr,"Ingresa la asignatura");
        Asignatura asignatura = asignaturaService.creaAsignatura(asignaturaCadena.split(","));
        String profesorCadena = leeDatos(sc, "Ingresa los datos del profesor");//  Juan Perez,juanperez@correo.com,1234
        //profesorCadena.split(",") -> {{Juan Perez},{juanperez@correo.com},{1234}}
        Profesor profesor = profesorService.creaProfesor(profesorCadena.split(","));
        int numeroEstudiantes = Integer.parseInt(leeDatos(sc, "cuantos estudiantes se agregaran al grupo"));
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        for(int i = 0; i < numeroEstudiantes; i++){
            String estudianteCadena = leeDatos(sc, "Ingresa los datos del alumno");
            Estudiante estudiante = estudianteService.creaEstudiante(estudianteCadena.split(","));
            estudiantes.add(estudiante);
        }
        String[] grupoCadena =leeDatos(sc, "Ingresa la clave del grupo y el horario").split(",");
        return  grupoService.crearGrupo(Long.parseLong(grupoCadena[0]),grupoCadena[1],profesor,asignatura, estudiantes);

    }*/

}
