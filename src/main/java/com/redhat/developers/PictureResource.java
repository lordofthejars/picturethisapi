package com.redhat.developers;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import net.bytebuddy.asm.Advice.Origin;

@Path("/overlayImage")
public class PictureResource {

    @RestClient
    @Inject
    PictureService pictureService;

    @Transactional
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response overlayImage(Picture pic) {
        pic.setGreeting("IBM TechXChange");
        pic.setImageType("JPG");
        pic.setLanguage("en");
        pic.setLocation("US");
        pic.setDateFormatString("MMMM d, yyyy");

        return pictureService.overlayImage(pic);
    }
};