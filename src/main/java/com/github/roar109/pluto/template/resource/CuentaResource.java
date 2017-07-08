package com.github.roar109.pluto.template.resource;

import com.github.roar109.pluto.template.dto.CuentaTemplate;
import com.github.roar109.pluto.template.repository.CuentaRepository;
import org.apache.log4j.Logger;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by hector.mendoza on 07/07/2017.
 */

@Path("cuenta")
public class CuentaResource {

    @Inject
    private Logger log;

    @Inject
    private CuentaRepository cuentaRepository;

    @GET
    @Path("entidad/{entidadid}")
    public void getTemplatesByEntidad(@PathParam("entidadid") final Integer entidadId){
        log.info("Reading templates by entity id "+entidadId);
    }

    @POST
    @Path("save")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public CuentaTemplate saveTemplate(final CuentaTemplate cuenta){
        log.info("Saving template");
        return cuentaRepository.save(cuenta);
    }

    @GET
    @Path("{templateId}")
    @Produces(MediaType.APPLICATION_JSON)
    public CuentaTemplate getTemplateById(@PathParam("templateId") final Integer templateId){
        log.info("Reading template with id "+templateId);
        return cuentaRepository.getById(templateId);
    }

    @POST
    @Path("clone/{templateId}")
    @Produces(MediaType.APPLICATION_JSON)
    public CuentaTemplate cloneTemplate(@PathParam("templateId") final Integer templateId){
        log.info("Cloning template with id "+templateId);
        return cuentaRepository.cloneTemplate(templateId);
    }

    @POST
    @Path("publish/{templateId}")
    public void publishTemplate(@PathParam("templateId") final Integer templateId){
        log.info("Publishing template with id "+templateId);
    }
}
