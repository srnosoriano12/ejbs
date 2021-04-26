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

@Provider
public class NullPointerExceptionFilter implements ExceptionMapper<NullPointerException>{

    @Override
    public Response toResponse(NullPointerException exception) {
        PerrorDta error = new PerrorDta(exception.getMessage(),new Date().toString());
        
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity(error)
                .build();
    }
    
    
    
}
