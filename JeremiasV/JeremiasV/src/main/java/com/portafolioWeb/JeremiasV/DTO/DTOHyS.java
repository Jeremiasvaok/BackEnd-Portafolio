package com.portafolioWeb.JeremiasV.DTO;

import jakarta.validation.constraints.NotBlank;


public class DTOHys {
    @NotBlank
    private String nombre;
    @NotBlank
    private int porcentaje;

    public DTOHys() {
    }

    public DTOHys(String nombre, int porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
}