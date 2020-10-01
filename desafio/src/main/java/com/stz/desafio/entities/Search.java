package com.stz.desafio.entities;

import java.io.Serializable;
import java.util.ArrayList;

public class Search implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long total_count;
    private boolean incomplet;
    ArrayList < Project > items = new ArrayList < Project > ();

    public Long getTotal_count() {
        return total_count;
    }

    public ArrayList < Project > getItems() {
        return items;
    }

    public boolean isIncomplet() {
        return incomplet;
    }

    public void setIncomplet(boolean incomplet) {
        this.incomplet = incomplet;
    }

    public void setTotal_count(Long total_count) {
        this.total_count = total_count;
    }

    public void setItems(ArrayList < Project > items) {
        this.items = items;
    }

    
}
