package com.escuela;

import com.escuela.controller.EscuelaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

//@SpringBootApplication
public class EscuelaApplication {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		EscuelaController controller = new EscuelaController();
		//SpringApplication.run(EscuelaApplication.class, args);
		while (true){
			System.out.println("Bienvenido al sistema escolar\nQue operacion deseas realizar?");
			System.out.println("1.crear Estudiante");
			System.out.println("2.crear Profesor");
			System.out.println("3.crear Asignatura");
			System.out.println("4.crearGrupo");
			System.out.println("5.Ver todos los estudiantes");
			System.out.println("6.Ver todos los Profesores");
			System.out.println("7.Ver todas las Asignaturas");
			System.out.println("8. Ver todos los grupos");
			System.out.println("0.Salir");
			String res = sc.nextLine();
			switch (res){
				case "1":
					controller.leeEstudiante();
					break;
				case "2":
					controller.leeProfesor();
					break;
				case "3":
					controller.leeAsignatura();
					break;
				case "4":
					controller.leeGrupo();
				case "5":
					System.out.println(controller.obtenerTodosEstudiantes());
					break;
				case "6":
					System.out.println(controller.obtenerTodosProfesores());
					break;
				case "7":
					System.out.println(controller.obtenerTodasAsignaturas());
					break;
				case "8":
					System.out.println(controller.obtenerTodosLosGrupos());
					break;
				case "0":
					return;
				default:
					System.err.println("Opcion incorrecta");
			}
		}
	}

}
