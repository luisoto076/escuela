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
    Ana Diaz,ana@mail.com,12345,254685469654
    Thady Salmeron,thaddy@mail.com,12345,254685469668
    Luis Soto,luis@mail.com,12345,254685469675
    Alejandro Diaz,alejandro@mail.com,12345,254685469689
    Rafael Diaz,rafael@mail.com,12345,254685469612
    */

    @Override
    public String toString(){
        return String.format("%s, %s, %s\n",nombre,usuario.getCorreo(),matricula);
    }

}
