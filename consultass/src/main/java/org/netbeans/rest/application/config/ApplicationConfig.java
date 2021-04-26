/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Jose Luis
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.ucundinamarca.estudiantes.consultass.ConsultasController.class);
        resources.add(com.ucundinamarca.estudiantes.consultass.MedicoController.class);
        resources.add(com.ucundinamarca.estudiantes.consultass.exception.filtro.BadResquestExceptionFilter.class);
        resources.add(com.ucundinamarca.estudiantes.consultass.exception.filtro.ConstraintViolationFilter.class);
        resources.add(com.ucundinamarca.estudiantes.consultass.exception.filtro.ExceptionsFilter.class);
        resources.add(com.ucundinamarca.estudiantes.consultass.exception.filtro.ModelNotFoundExceptionFiltro.class);
        resources.add(com.ucundinamarca.estudiantes.consultass.exception.filtro.NotAllowedExceptionFilter.class);
        resources.add(com.ucundinamarca.estudiantes.consultass.exception.filtro.NotFoundExceptionFilter.class);
        resources.add(com.ucundinamarca.estudiantes.consultass.exception.filtro.NotSupportedExceptionFilter.class);
        resources.add(com.ucundinamarca.estudiantes.consultass.exception.filtro.NullPointerExceptionFilter.class);
        resources.add(com.ucundinamarca.estudiantes.consultass.exception.filtro.WebApplicationExceptionFilter.class);
    }
    
}
