/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucundinamarca.estudiantes.consultass.pojos;

import java.io.Serializable;

/**
 *
 * @author Jose Luis Soriano Roa 
 * @autor Sergio Sabogal
 * @since 15/03/2021
 * @version 1.0.0
 */
public class PerrorDto implements Serializable{

    /**
     * Mensaje de el error
     */
    private String mensaje;
    /**
     * Fecha del error
     */
    private String fecha;

   
    /**
     * Path de error
     */
    private String path;
    
    
    /**
     * Constructor de la clase 
     * @param mensaje del error
     * @param fecha  del error
     */
    
    public PerrorDto(String mensaje, String fecha,String path){
        this.mensaje = mensaje;
        this.fecha = fecha;
        this.path = path;
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
    
     public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}