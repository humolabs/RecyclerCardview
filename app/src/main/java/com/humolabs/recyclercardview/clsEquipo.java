package com.humolabs.recyclercardview;

/**
 * Created by USUARIO on 21/04/2016.
 */
public class clsEquipo {
    private String nombre_equipo;
    private String categoria_equipo;
    private int escudo_equipo;

    //Constructor
    public clsEquipo(String nombre_equipo, String categoria_equipo, int escudo_equipo) {
        this.nombre_equipo = nombre_equipo;
        this.categoria_equipo = categoria_equipo;
        this.escudo_equipo = escudo_equipo;
    }

    //Getters
    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public String getCategoria_equipo() {
        return categoria_equipo;
    }

    public int getEscudo_equipo() {
        return escudo_equipo;
    }
}
