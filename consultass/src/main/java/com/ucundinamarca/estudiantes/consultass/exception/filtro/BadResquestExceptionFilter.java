/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucundinamarca.estudiantes.consultass.exception.filtro;

import com.ucundinamarca.estudiantes.consultass.pojos.PerrorDta;
import java.util.Date;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class BadResquestExceptionFilter implements ExceptionMapper<BadRequestException>{

    @Override
    public Response toResponse(BadRequestException exception) {
        PerrorDta error = new PerrorDta("Error en peticion", new Date().toString());
        return Response.status(Response.Status.BAD_REQUEST).entity(error).build();
    }
    
    
    
}