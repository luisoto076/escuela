package com.escuela.model;

public class Profesor {

    private String nombre;
    private Usuario usuario;
    private String foto;

    public  Profesor(){}

    public Profesor(String nombre, Usuario usuario, String foto){
        this.nombre = nombre;
        this.usuario = usuario;
        this.foto = foto;
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

    public String toString(){
        return String.format("%s, %s\n", nombre, usuario.getCorreo());
    }
}
