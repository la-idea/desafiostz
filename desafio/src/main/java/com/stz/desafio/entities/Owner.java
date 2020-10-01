package com.stz.desafio.entities;
import java.io.Serializable;


public class Owner implements Serializable {
    private static final long serialVersionUID = 3L;

    private String login;
    private float id;
    private String node_id;
    private String avatar_url;
    private String gravatar_id;
    private String url;
    private String received_events_url;
    private String type;
    
    
    // Getter Methods 
    
    public String getLogin() {
        return login;
    }
    
    public float getId() {
        return id;
    }
    
    public String getNode_id() {
        return node_id;
    }
    
    public String getAvatar_url() {
        return avatar_url;
    }
    
    public String getGravatar_id() {
        return gravatar_id;
    }
    
    public String getUrl() {
        return url;
    }
    
    public String getReceived_events_url() {
        return received_events_url;
    }
    
    public String getType() {
        return type;
    }
    
    // Setter Methods 
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public void setId(float id) {
        this.id = id;
    }
    
    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }
    
    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }
    
    public void setGravatar_id(String gravatar_id) {
        this.gravatar_id = gravatar_id;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    public void setReceived_events_url(String received_events_url) {
        this.received_events_url = received_events_url;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    

}
