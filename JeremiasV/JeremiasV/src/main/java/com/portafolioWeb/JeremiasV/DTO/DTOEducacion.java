package com.portafolioWeb.JeremiasV.DTO;

import jakarta.validation.constraints.NotBlank;


public class DTOEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;

    public DTOEducacion() {
    }

    public DTOEducacion(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
    
}