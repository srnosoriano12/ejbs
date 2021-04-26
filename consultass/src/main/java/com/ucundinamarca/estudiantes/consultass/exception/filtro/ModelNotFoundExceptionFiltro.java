/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucundinamarca.estudiantes.consultass.exception.filtro;

import com.mycompany.consultasejbb.exception.ModelNotFoundException;
import com.ucundinamarca.estudiantes.consultass.pojos.PerrorDto;
import java.util.Date;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * filtro de la excepcion al no encontrar un objeto
 * @author Jose Luis Soriano Roa
 * @author Sergio Sabogal
 * @since  15/03/2021
 * @version 1.0.0
 */

@Provider
public class ModelNotFoundExceptionFiltro implements ExceptionMapper<ModelNotFoundException>{

    @Override
    public Response toResponse(ModelNotFoundException exception){
        
        String mensaje = exception.getMessage();
        PerrorDto error = new PerrorDto(mensaje.substring(0,mensaje.indexOf(".")), new Date().toString(),mensaje.substring(mensaje.indexOf(".")+1));
        return Response.status(Response.Status.NOT_FOUND).entity(error).build();
    }
}