package be.brussel.nature.forestnotebook;

import be.brussel.nature.animals.*;
import be.brussel.nature.plants.Plant;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ForestNotebook {

    private List<Animal> animals;
    private List<Plant> plants;
    private List<Carnivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;
    private int plantCount;
    private int animalCount;

    {
        animals = new LinkedList<>();
        plants = new LinkedList<>();
        carnivores = new LinkedList<>();
        omnivores = new LinkedList<>();
        herbivores = new LinkedList<>();
        plantCount = 0;
        animalCount = 0;
    }

    public void addAnimal(Animal animal){
        if(animals.contains(animal)){
            return;
        }
        animals.add(animal);
        addToTypeList(animal);
        animalCount ++;
    }

    private void addToTypeList(Animal animal){
        if(animal instanceof Carnivore){
            carnivores.add((Carnivore) animal);
        } else if(animal instanceof Herbivore){
            herbivores.add((Herbivore) animal);
        } else if(animal instanceof Omnivore){
            omnivores.add((Omnivore) animal);
        }
    }

    public void addPlant(Plant plant){
        if(plants.contains(plant)){
            return;
        }
        plants.add(plant);
        plantCount ++;
    }

    public void sortAnimalsByName(){
        animals.sort(Comparator.comparing(Animal::getName));
    }

    public void sortPlantsByName(){
        plants.sort(Comparator.comparing(Plant::getName));

    }

    public void sortAnimalsByHeight(){
        animals.sort(Comparator.comparing(Animal::getHeight));
    }

    public void sortPlantsByHeight(){
        plants.sort(Comparator.comparing(Plant::getHeight));
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void printNotebook(){
        System.out.println("ForestNotebook:\n Animals: ");
        animals.forEach(System.out::println);
        System.out.println(" Plants:");
        plants.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "ForestNotebook{" +
                "animals=" + animals +
                ", plants=" + plants +
                ", carnivores=" + carnivores +
                ", omnivores=" + omnivores +
                ", herbivores=" + herbivores +
                ", plantCount=" + plantCount +
                ", animalCount=" + animalCount +
                '}';
    }
}
