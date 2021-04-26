/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucundinamarca.estudiantes.consultass.exception.filtro;

import com.ucundinamarca.estudiantes.consultass.pojos.PerrorDta;
import java.util.Date;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Jose Luis Soriano Roa
 * @author Sergio Sabogal 
 * @since 17/03/2021
 * @version 1.0.0
 */
@Provider
public class ExceptionsFilter implements ExceptionMapper<Exception>{
    @Override
    public Response toResponse(Exception exception) {
        
        if(exception.getClass().toString().contains("PathParamException")){
            PerrorDta error = new PerrorDta("Tipo de entrada incorrecto",new Date().toString());
            return Response.status(Response.Status.BAD_REQUEST)
                .entity(error)
                .build();
        }
        return Response.status(Response.Status.BAD_REQUEST)
                .entity("Se produjo un error" + exception.getClass().getName())
                .build();
    }

}