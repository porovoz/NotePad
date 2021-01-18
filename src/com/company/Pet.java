package com.company;

public class Pet extends Record {
    private String name;
    private Species species;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    @Override
    public String toString () {
        var str = super.toString();
        return String.format("%s; name: %s; species: %s", str, name, species);
    }

    @Override
    public void askData() {
        name = InputUtils.askString("Name");
        for (Species S : Species.values()) {
            System.out.println("Available species: " + S);
        }
        species = Species.valueOf(InputUtils.askString("Species"));
    }

    @Override
    public boolean contains(String substr) {
        var strspecies = String.valueOf(species);
        return super.contains(substr)
                || name.toLowerCase().contains(substr)
                || strspecies.toLowerCase().contains(substr);
    }
}
