package com.example.superhero.service;

import com.example.superhero.model.Superhero;

import java.util.List;

public interface SuperheroService {

    public Superhero addSuperhero(Superhero superhero);

    public List<Superhero> getAllSuperheroes();
}
