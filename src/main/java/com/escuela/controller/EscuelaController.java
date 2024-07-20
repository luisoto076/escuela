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
import java.util.Scanner;

public class EscuelaController {
    AsignaturaService asignaturaService = new AsignaturaService();
    ProfesorService profesorService = new ProfesorService();
    EstudianteService estudianteService = new EstudianteService();
    GrupoService grupoService = new GrupoService();

    public String leeDatos(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextLine();
    }

    public Estudiante creaEstudiante(){
        Scanner sc = new Scanner(System.in);
        String cadenaEstudiante = leeDatos(sc, "Ingesa los datos del estudiante");
        Estudiante estudiante = estudianteService.creaEstudiante(cadenaEstudiante.split(","));
        return  estudiante;
    }

    public Estudiante obtenEstudiantePorMatricula(String matricula){
        return estudianteService.obtenEstudiantePorMatricula(matricula);
    }

    public Grupo creaGrupo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al asistente para crear Grupos");
        String asignaturaCadena = leeDatos(sc,"Ingresa la asignatura");
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

    }

    public static void main(String[] args) {
        EscuelaController es = new EscuelaController();
        es.creaEstudiante();
        es.creaEstudiante();
        es.creaEstudiante();
        es.creaEstudiante();
        Estudiante e1 = es.obtenEstudiantePorMatricula("100001");
        Estudiante e2 = es.obtenEstudiantePorMatricula("100002");
        Estudiante e3 = es.obtenEstudiantePorMatricula("100003");
        Estudiante e4 = es.obtenEstudiantePorMatricula("100004");
    }
}
