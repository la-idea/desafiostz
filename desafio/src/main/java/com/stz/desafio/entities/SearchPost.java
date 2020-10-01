package com.stz.desafio.entities;

public class SearchPost {
    private String search;
    private String sort;
    private String order;

    public String getSearch() {
        return search;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
