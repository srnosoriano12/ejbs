/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucundinamarca.estudiantes.consultass.exception.filtro;

import com.ucundinamarca.estudiantes.consultass.pojos.PerrorDta;
import java.util.Date;
import javax.ws.rs.NotAllowedException;
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
public class NotAllowedExceptionFilter implements ExceptionMapper<NotAllowedException>{

    @Override
    public Response toResponse(NotAllowedException exception) {
        PerrorDta error = new PerrorDta("Error en tipo de peticion",new Date().toString());
        return Response.status(Response.Status.METHOD_NOT_ALLOWED)
                .entity(error)
                .build();
    }

}