package com.modules.conversor.modelos;

import java.util.HashMap;
import java.util.Map;

public class moneda {
    private String nombre;

    public moneda(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre ;
    }
}
