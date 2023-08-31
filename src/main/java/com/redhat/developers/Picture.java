package com.redhat.developers;

import jakarta.json.bind.annotation.JsonbCreator;

public class Picture {

    private String imageData;
    private String imageType;
    private String greeting;
    private String language;
    private String location;
    private String dateFormatString; 

    Picture(String imageData) {
        this.imageData = imageData;
    }

    @JsonbCreator
    public static Picture of(String imageData) {
        return new Picture(imageData);
    }

    public String getImageData() {
        return imageData;
    }
    public void setImageData(String imageData) {
        this.imageData = imageData;
    }

    public String getImageType() {
        return imageType;
    }
    public void setImageType(String imageType) {
        this.imageType = imageType;
    }
    
    public String getGreeting() {
        return greeting;
    }
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getDateFormatString() {
        return dateFormatString;
    }
    public void setDateFormatString(String dateFormatString) {
        this.dateFormatString = dateFormatString;
    }
}