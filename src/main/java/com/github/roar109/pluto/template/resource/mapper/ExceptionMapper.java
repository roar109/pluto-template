package com.github.roar109.pluto.template.resource.mapper;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by hector.mendoza on 07/07/2017.
 */
public class ExceptionMapper implements javax.ws.rs.ext.ExceptionMapper<Exception> {

    public Response toResponse(Exception exception) {
        return Response.ok(exception.getMessage(), MediaType.APPLICATION_JSON)
                .status(Response.Status.BAD_REQUEST).build();
    }
}
