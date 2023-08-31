package com.redhat.developers;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import net.bytebuddy.asm.Advice.Origin;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/overlayImage")
@RegisterRestClient
public interface PictureService {

    @POST
    Response overlayImage(Picture pictureToSend);

}

