package com.stz.desafio.resources;

import com.stz.desafio.entities.Result;
import com.stz.desafio.entities.Search;
import com.stz.desafio.entities.SearchPost;
import com.stz.desafio.repositories.SearchRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/search")
public class SearchResource {

    @Autowired
    private SearchRepository searchRepository;
   

    @RequestMapping(value = "/a", method =  RequestMethod.POST)
    public ResponseEntity< Result > resPost(@RequestBody SearchPost searchPost){
        Result resultado = searchRepository.resHttp(searchPost);
        return ResponseEntity.ok().body(resultado);
    }
    

	@GetMapping(value = "/{q}")
	public ResponseEntity< Search > findQ(@PathVariable String q) {
		Search search = searchRepository.findQ(q);
		return ResponseEntity.ok().body(search);
	}
}