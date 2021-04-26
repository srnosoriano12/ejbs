/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucundinamarca.estudiantes.consultass.pojos;

/**
 * Clase cascaron para retornar error
 * @author Jose Luis Soriano Roa
 * @author Sergio Sabogal
 * @since  15/03/2021
 * @version 1.0.0
 */
public class PerrorDta {

  
    
    /**
     * Mensaje de error
     */
    private String mensaje;
    /**
     * Fecha de error
     */
    private String fecha;
    
    public PerrorDta(String mensaje, String fecha) {
        this.mensaje = mensaje;
        this.fecha = fecha;
    }
    
      public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
}