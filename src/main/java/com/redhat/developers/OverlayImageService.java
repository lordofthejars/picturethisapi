package com.redhat.developers;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class OverlayImageService{

    @Inject
    @RestClient
    PictureService pictureService;

    public void overlayImage(String imageData){

         Picture pic = new Picture(imageData);

         pic.setGreeting("Having a wonderful time");
         pic.setImageType("JPG");
         pic.setLanguage("en");
         pic.setLocation("US");
         pic.setDateFormatString("MMMM d, yyyy");
        
         pictureService.overlayImage(pic);
   } 
}