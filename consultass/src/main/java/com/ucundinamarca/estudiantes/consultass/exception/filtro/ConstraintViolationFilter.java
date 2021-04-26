/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucundinamarca.estudiantes.consultass.exception.filtro;

import com.ucundinamarca.estudiantes.consultass.pojos.PerrorDta;
import java.util.Date;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ConstraintViolationFilter implements ExceptionMapper<ConstraintViolationException>{

    @Override
    public Response toResponse(ConstraintViolationException exception) {
        
        PerrorDta error = new PerrorDta(prepareMessage(exception),new Date().toString());
        return Response.status(Response.Status.BAD_REQUEST).entity(error).build();
    }
    
    private String prepareMessage(ConstraintViolationException ex){
        String mensaje = "";
        for(ConstraintViolation<?> cv : ex.getConstraintViolations()){
            mensaje = cv.getPropertyPath()+ "  " + cv.getMessage()+"\n";
        }
        return mensaje;
    }
}