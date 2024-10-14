package com.example.superhero.controller;

import com.example.superhero.model.Superhero;
import com.example.superhero.service.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/superheroes")
public class SuperheroController {

    @Autowired
    private SuperheroService superhearService;

    @PostMapping("add")
    public ResponseEntity<Superhero> addSuperhero(@RequestBody Superhero superhero) {
        Superhero savedSuperhero = superhearService.addSuperhero(superhero);
        return new ResponseEntity<>(savedSuperhero, HttpStatus.CREATED);
    }

    @GetMapping("list")
    public ResponseEntity<List<Superhero>> getAllSuperheroes() {
        List<Superhero> superheroes = superhearService.getAllSuperheroes();
        return new ResponseEntity<>(superheroes, HttpStatus.OK);
    }
}
