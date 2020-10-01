package com.stz.desafio.repositories;

import com.stz.desafio.entities.Project;
import com.stz.desafio.entities.Result;
import com.stz.desafio.entities.Search;
import com.stz.desafio.entities.SearchPost;

import java.util.ArrayList;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class SearchRepository {

    private String url;
    static RestTemplate restTemplate = new RestTemplate();

    public Search findQ(String q) {
        url = "https://api.github.com/search/repositories?q=" + q + "&sort=stars&order=desc";
        Search search = restTemplate.getForObject(url, Search.class);
        ;

        return search;
    }

    public Result resHttp(SearchPost searchPost) {
        url = "https://api.github.com/search/repositories?q=" + searchPost.getSearch() + "&sort=" + searchPost.getSort()
                + "&order=" + searchPost.getOrder();
        
        Search search = restTemplate.getForObject(url, Search.class);
        ArrayList<Project> items = search.getItems();
        Result result = new Result();

        result.setTotal_count(search.getTotal_count());
        items.forEach(x -> result.addProject(x));

        return result;       

    }
}