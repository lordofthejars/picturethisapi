package com.redhat.developers;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.vertx.core.json.JsonObject;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import net.bytebuddy.asm.Advice.Origin;

@Path("/text")
public class TextResource {

    @RestClient
    TextService textService;


    @GET
    public String GetPictureText() {
        // Get random text here
        Text t = new Text(0, "Hello World");

        // When I activate the following line it bombs
        t = textService.text();
        //
        return t.picturetext();
    }

};