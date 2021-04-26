/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucundinamarca.estudiantes.consultass;

import com.mycompany.consultasejbb.entity.Consulta;
import com.mycompany.consultasejbb.exception.ModelNotFoundException;
import com.mycompany.consultasejbb.service.IConsultaService;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Stateless
@Path("/consultas")
public class ConsultasController {
    
  @EJB
    private IConsultaService service;
    
    @GET
    @Path("/lista")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscar() {        
        return Response.status(Response.Status.OK)
                .entity(service.buscar())
                .build();
    }
        
    @GET
    @Path("/buscar/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response buscarID(@PathParam("id") int id) {        
        return Response.status(Response.Status.OK)
                .entity(service.buscarID(id))
                .build();
    }

    @POST
    @Path("/guardar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response guardar(@Valid Consulta consulta) {
        service.guardar(consulta);
        return Response.status(Response.Status.CREATED)
                .build();
    }
    
    
    @DELETE
    @Path("/eliminar/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response eliminar(@PathParam("id") int id) throws ModelNotFoundException {  
        service.eliminar(id);
        return Response.status(Response.Status.NOT_FOUND)
                .build();
    }
        
}
