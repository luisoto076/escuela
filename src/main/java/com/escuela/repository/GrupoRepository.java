package com.escuela.repository;
import com.escuela.model.Grupo;
import java.util.ArrayList;
import java.util.List;

public class GrupoRepository {
    List<Grupo> base = new ArrayList<>();

    public List<Grupo> obtenerTodosLosGrupos(){
        return base;
    }

    public void  guardar(Grupo grupo){
        base.add(grupo);
    }
}
