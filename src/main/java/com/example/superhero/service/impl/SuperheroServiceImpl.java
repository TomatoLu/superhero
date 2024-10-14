package com.example.superhero.service.impl;

import com.example.superhero.model.Superhero;
import com.example.superhero.repository.SuperheroRepository;
import com.example.superhero.service.SuperheroService;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperheroServiceImpl implements SuperheroService {

    @AutoConfigureOrder
    private SuperheroRepository superheroRepository;

    @Override
    public Superhero addSuperhero(Superhero superhero) {
        return superheroRepository.save(superhero);
    }

    @Override
    public List<Superhero> getAllSuperheroes() {
        return superheroRepository.findAll();
    }
}
