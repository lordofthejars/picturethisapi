package com.redhat.developers;

import jakarta.json.bind.annotation.JsonbCreator;

public class Text {

    private Integer id;
    private String  picturetext;

    Text(Integer id, String picturetext) {
        this.id = id;
        this.picturetext = picturetext;
    }

    @JsonbCreator
    public static Text of(Integer id, String picturetext) {
        return new Text(id, picturetext);
    }

    public Integer id() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String picturetext() {
        return picturetext;
    }
    public void setPictureText(String picturetext) {
        this.picturetext = picturetext;
    }
}
