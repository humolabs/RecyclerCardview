package com.humolabs.recyclercardview;

import java.util.List;


public class clsCategoria {
    private int idCategoria;
    private String descripcionCategoria;
    private List<clsEquipo> equipos;

    //Constructor
    public clsCategoria(int idCategoria, String descripcionCategoria, List<clsEquipo> equipos) {
        this.idCategoria = idCategoria;
        this.descripcionCategoria = descripcionCategoria;
        this.equipos = equipos;
    }

    //Getters
    public int getIdCategoria() {
        return idCategoria;
    }

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public List<clsEquipo> getEquipos() {
        return equipos;
    }
}
