/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucundinamarca.estudiantes.consultass;

import com.mycompany.consultasejbb.entity.Medico;
import com.mycompany.consultasejbb.exception.ModelNotFoundException;
import com.mycompany.consultasejbb.service.IMedicoService;
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
@Path("/medico")
@Produces(MediaType.APPLICATION_JSON)
public class MedicoController {
    @EJB
    private IMedicoService service;
    
    @GET
    @Path("/lista")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscar() {        
        return Response.status(Response.Status.OK)
                .entity(service.buscar())
                .build();
    }
    
    @POST
    @Path("/guardar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response guardar(@Valid Medico medico) {
        service.guardar(medico);
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
    
    @GET
    @Path("/buscar/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response buscarID(@PathParam("id") int id) throws ModelNotFoundException {        
        return Response.status(Response.Status.OK)
                .entity(service.buscarID(id))
                .build();
    }
    
    
    
    
    
}
