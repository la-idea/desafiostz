package com.stz.desafio.entities;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

public class Result {
    private Long total_count;
    private ArrayList<Item> items = new ArrayList<Item>();
    
    @Autowired
    Item item;
	
    public Long getTotal_count() {
        return total_count;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItems(Object object){
        this.items.add((Item) object);
    }
    
    public void addProject(Project project){
        Item novoItem = new Item();
        novoItem.setId(project.getId());
        novoItem.setName(project.getName());
        novoItem.setOwner(project.getOwner().getLogin());
        novoItem.setUrl(project.getUrl());
        if (project.getStargazers_count() > 100000){
            novoItem.setFamous(true);
        }else{
            novoItem.setFamous(false);
        }
        this.items.add(novoItem);
    }

    public void setTotal_count(Long total_count) {
        this.total_count = total_count;
    }

}
