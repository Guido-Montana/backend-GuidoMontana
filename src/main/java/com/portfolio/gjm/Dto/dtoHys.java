/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.gjm.Dto;


import javax.validation.constraints.NotBlank;


public class dtoHys {
    @NotBlank
    private String nombre;
    @NotBlank
    private String color;
    @NotBlank
    private String tFuente;
    @NotBlank
    private int porcentaje;

    public dtoHys() {
    }

    public dtoHys(String nombre, String color, String tFuente, int porcentaje) {
        this.nombre = nombre;
        this.color = color;
        this.tFuente = tFuente;
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String gettFuente() {
        return tFuente;
    }

    public void settFuente(String tFuente) {
        this.tFuente = tFuente;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    

   
    
    
}