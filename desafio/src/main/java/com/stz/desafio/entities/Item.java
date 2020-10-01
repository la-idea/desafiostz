package com.stz.desafio.entities;

import org.springframework.stereotype.Component;

@Component
public class Item {
    private float id;
    private String name;
    private String owner;
    private String url;
    private boolean famous;

    public float getId() {
        return id;
    }

    public boolean isFamous() {
        return famous;
    }

    public void setFamous(boolean famous) {
        this.famous = famous;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(float id) {
        this.id = id;
    }


}
