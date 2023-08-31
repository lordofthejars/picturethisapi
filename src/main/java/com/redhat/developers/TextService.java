package com.redhat.developers;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import java.util.Set;

@Path("/text")
@RegisterRestClient
public interface TextService {

    @GET
    Text text();
}