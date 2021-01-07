package be.brussel.nature.animals;

import be.brussel.nature.plants.Plant;

import java.util.LinkedHashSet;
import java.util.Set;

public class Omnivore extends Animal{

    private Set<Plant> plantDiet;
    private double maxFoodSize;

    {
        plantDiet = new LinkedHashSet<>();
    }

    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public void addPlantToDiet(Plant plant){
        plantDiet.add(plant);
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        if(maxFoodSize<0){
            this.maxFoodSize=0;
        } else {
            this.maxFoodSize = maxFoodSize;
        }
    }

    @Override
    public String toString() {
        return super.toString()+ " The type of animal is a omnivore: \n" +
                "   the plant diet consists of " + diet() +
                "\n   the maximum food size is " + maxFoodSize +
                ".";
    }

    private String diet(){
        return plantDiet.stream().map(Plant::getName).reduce("",(acc,ell) ->acc+ell+" ");
    }
}
