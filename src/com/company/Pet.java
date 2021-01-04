package com.company;

public class Pet extends Record {
    private String name;
    private String species;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void askData() {
        name = InputUtils.askString("Name");
        System.out.println("Available species: CAT, DOG, RABBIT, FISH, BIRD");
        species = InputUtils.askString("Species");
    }

    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s; name: %s; species: %s", str, name, species);
    }
}
