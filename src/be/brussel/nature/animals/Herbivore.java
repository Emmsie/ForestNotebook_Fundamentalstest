package be.brussel.nature.animals;

import be.brussel.nature.plants.Plant;

import java.util.LinkedHashSet;
import java.util.Set;

public class Herbivore extends Animal{

    private Set<Plant> plantDiet;

    {
        plantDiet = new LinkedHashSet<>();
    }

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public void addPlantToDiet(Plant plant){
        plantDiet.add(plant);
    }

    public void printDiet(){
        plantDiet.stream().map(Plant::getName).forEach(System.out::print);
    }

    @Override
    public String toString() {
        return super.toString()+ " The type of animal is a herbivore: \n" +
                "   the plant diet consists of " + diet() +
                ".";
    }

    private String diet(){
        return plantDiet.stream().map(Plant::getName).reduce("",(acc,ell) ->acc+ell+" ");
    }
}
