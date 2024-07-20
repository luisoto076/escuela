package com.escuela.model;

import java.util.ArrayList;
import java.util.Collection;

public class Estudiante {
    private String nombre;
    private Usuario usuario;
    private String  foto;
    private String matricula;

    public Estudiante(){}

    public Estudiante(String nombre, Usuario usuario, String foto, String matricula){
        //this = createObject()
        this.nombre = nombre;
        this.usuario = usuario;
        this.foto = foto;
        this.matricula = matricula;
        //return this
    }

    public void saludar(String nombre){
        //this = u1
        System.out.println("Hola "+nombre+", yo me llamo "+ this.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /*
    * Crear un Grupo
    *   -llamar al constructor GRupo
    *   - Crear un Profesor
    *       -Llamar const
    *       - crear Usuario
    *   -Crear una Asignatura
    *   -Crear una lista
    * */

    private static Profesor creaProfesor(){
        Usuario usuarioProfesor = new Usuario("juan.lopez@mail.com","12345","PROF");//usuario
        Profesor profesor = new Profesor("Juan Lopez", usuarioProfesor,"foto.jpg");//profesor
        return profesor;
    }
    private Profesor creaProfesorResumido(){
        return new Profesor("Juan Lopez", new Usuario("juan.lopez@mail.com","12345","PROF"),"foto.jpg");
    }

    private static Asignatura crearAsignatura(){
        return new Asignatura("Matematicas", 20,"Preparatoria", "5to");
    }

    private static Collection<Evaluacion> crearLista(){
        ArrayList<Evaluacion> lista = new ArrayList<>();
        Estudiante estudiate1 = new Estudiante("Ana Diaz",new Usuario(),"foto.jpg","254685469654");
        Estudiante estudiate2 = new Estudiante("Thady Salmeron",new Usuario(),"foto.jpg","254685469668");
        Estudiante estudiate3 = new Estudiante("Luis Soto",new Usuario(),"foto.jpg","254685469675");
        Estudiante estudiate4 = new Estudiante("Alejandro Diaz",new Usuario(),"foto.jpg","254685469689");
        Estudiante estudiate5 = new Estudiante("Rafael Diaz",new Usuario(),"foto.jpg","254685469612");
        lista.add(new Evaluacion(estudiate1,0.0f,null));
        lista.add(new Evaluacion(estudiate2,0.0f,null));
        lista.add(new Evaluacion(estudiate3,0.0f,null));
        lista.add(new Evaluacion(estudiate4,0.0f,null));
        lista.add(new Evaluacion(estudiate5,0.0f,null));
        return lista;
    }

    public static void main(String[] args) {
        Profesor profesor = creaProfesor();
        Collection<Evaluacion> lista = crearLista();
        Asignatura asignatura = crearAsignatura();
        Grupo grupo = new Grupo(1056, profesor, lista, "4:00-6:00", asignatura);

    }


}
