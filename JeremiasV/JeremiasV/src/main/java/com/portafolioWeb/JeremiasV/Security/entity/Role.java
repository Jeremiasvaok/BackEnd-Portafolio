/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolioWeb.JeremiasV.Security.entity;

import com.portafolioWeb.JeremiasV.Security.enums.RolName;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;


@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
   private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
   private RolName rolName;

    public Role(RolName rolName) {
        this.rolName = rolName;
    }

    public Role() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RolName getRolName() {
        return rolName;
    }

    public void setRolName(RolName rolName) {
        this.rolName = rolName;
    }
    
   
}
