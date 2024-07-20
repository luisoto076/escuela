package com.escuela.model;

public class Usuario{
    private String correo;
    private String password;
    private String role;

    public Usuario(){}

    public Usuario(String correo, String password, String role){
        this.correo = correo;
        this.password = password;
        this.role = role;
    }

    public String getCorreo(){
        return correo;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getRole(){
        return role;
    }

    public void setRole(String role){
        this.role = role;
    }


}