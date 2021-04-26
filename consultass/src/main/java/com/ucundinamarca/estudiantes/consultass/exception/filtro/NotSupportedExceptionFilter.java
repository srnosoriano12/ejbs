/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucundinamarca.estudiantes.consultass.exception.filtro;

import com.ucundinamarca.estudiantes.consultass.pojos.PerrorDta;
import java.util.Date;
import javax.ws.rs.NotSupportedException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * filtro de la excepcion al presentarse un error de tipo de transaccion
 * @author Jose Luis Soriano Roa
 * @author Sergio Sabogal
 * @since  15/03/2021
 * @version 1.0.0
 */

@Provider
public class NotSupportedExceptionFilter implements ExceptionMapper<NotSupportedException>{

    @Override
    public Response toResponse(NotSupportedException exception) {
        
        PerrorDta error = new PerrorDta("Error, La entrada no es de tipo json",new Date().toString());
        return Response.status(Response.Status.UNSUPPORTED_MEDIA_TYPE)
                .entity(error)
                .build();
    }
}