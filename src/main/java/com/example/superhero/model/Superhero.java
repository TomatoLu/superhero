package com.example.superhero.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Superhero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String alias;
    private String name;

    @ElementCollection
    @CollectionTable(name = "superhero_powers", joinColumns = @JoinColumn(name = "superhero_id"))
    @Column(name = "power")
    private List<String> powers;

    @ElementCollection
    @CollectionTable(name = "superhero_weapons", joinColumns = @JoinColumn(name = "superhero_id"))
    @Column(name = "weapon")
    private List<String> weapons;

    private String origin;

    @ElementCollection
    @CollectionTable(name = "superhero_associations", joinColumns = @JoinColumn(name = "superhero_id"))
    @Column(name = "association")
    private List<String> associations;

    // Getters and Setters
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPowers() {
        return powers;
    }

    public void setPowers(List<String> powers) {
        this.powers = powers;
    }

    public List<String> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<String> weapons) {
        this.weapons = weapons;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public List<String> getAssociations() {
        return associations;
    }

    public void setAssociations(List<String> associations) {
        this.associations = associations;
    }

    // Constructors
    public Superhero() {}

    public Superhero(String alias, String name, List<String> powers, List<String> weapons, String origin, List<String> associations) {
        this.alias = alias;
        this.name = name;
        this.powers = powers;
        this.weapons = weapons;
        this.origin = origin;
        this.associations = associations;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "alias='" + alias + '\'' +
                ", name='" + name + '\'' +
                ", powers=" + powers +
                ", weapons=" + weapons +
                ", origin='" + origin + '\'' +
                ", associations=" + associations +
                '}';
    }
}
