package io.kerno.resources;

import java.util.List;
import java.util.Map;

import io.kerno.dto.ResourceDto;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/workloads")
public class WorkloadResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ResourceDto> all() {
        List<ResourceDto> resources = ResourceDto.findAll().list();
        return resources;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{uid}")
    public ResourceDto details(@PathParam("uid") String uid) {
        return getResource(uid);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{uid}/state")
    public Map<String, Object> state(@PathParam("uid") String uid) {
        return getResource(uid).status;
    }

    private ResourceDto getResource(String uid) {
        ResourceDto resource = ResourceDto.findById(uid);
        return resource;
    }

}
