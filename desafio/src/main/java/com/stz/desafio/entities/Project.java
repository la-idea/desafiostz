package com.stz.desafio.entities;
import java.io.Serializable;

public class Project implements Serializable {
    private static final long serialVersionUID = 2L;

    private float id;
    private String node_id;
    private String name;
    private String full_name;
    Owner owner;
    private boolean privado;
    private String html_url;
    private String description;
    private boolean fork;
    private String url;
    private String created_at;
    private String updated_at;
    private String pushed_at;
    private String homepage;
    private float size;
    private float stargazers_count;
    private float watchers_count;
    private String language;
    private float forks_count;
    private float open_issues_count;
    private String master_branch;
    private String default_branch;
    private float score;


 // Getter Methods 

    public float getId() {
        return id;
    }

    public String getNode_id() {
        return node_id;
    }

    public String getName() {
        return name;
    }

    public String getFull_name() {
        return full_name;
    }

    public Owner getOwner() {
        return owner;
    }

    public boolean getPrivado() {
        return privado;
    }

    public String getHtml_url() {
        return html_url;
    }

    public String getDescription() {
        return description;
    }

    public boolean getFork() {
        return fork;
    }

    public String getUrl() {
        return url;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getPushed_at() {
        return pushed_at;
    }

    public String getHomepage() {
        return homepage;
    }

    public float getSize() {
        return size;
    }

    public float getStargazers_count() {
        return stargazers_count;
    }

    public float getWatchers_count() {
        return watchers_count;
    }

    public String getLanguage() {
        return language;
    }

    public float getForks_count() {
        return forks_count;
    }

    public float getOpen_issues_count() {
        return open_issues_count;
    }

    public String getMaster_branch() {
        return master_branch;
    }

    public String getDefault_branch() {
        return default_branch;
    }

    public float getScore() {
        return score;
    }

    // Setter Methods 

    public void setId(float id) {
        this.id = id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFork(boolean fork) {
        this.fork = fork;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public void setPushed_at(String pushed_at) {
        this.pushed_at = pushed_at;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public void setStargazers_count(float stargazers_count) {
        this.stargazers_count = stargazers_count;
    }

    public void setWatchers_count(float watchers_count) {
        this.watchers_count = watchers_count;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setForks_count(float forks_count) {
        this.forks_count = forks_count;
    }

    public void setOpen_issues_count(float open_issues_count) {
        this.open_issues_count = open_issues_count;
    }

    public void setMaster_branch(String master_branch) {
        this.master_branch = master_branch;
    }

    public void setDefault_branch(String default_branch) {
        this.default_branch = default_branch;
    }

    public void setScore(float score) {
        this.score = score;
    }
    
    
}