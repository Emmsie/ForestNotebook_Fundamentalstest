package be.brussel.nature.app;

import be.brussel.nature.animals.*;
import be.brussel.nature.forestnotebook.ForestNotebook;
import be.brussel.nature.plants.*;

public class DietAnalyserApp {
    public static void main(String[] args) {
        ForestNotebook mySecretGarden = new ForestNotebook();

        Tree oak = new Tree("MagicOak", 30);
        Bush bush = new Bush("BerryBush", 0.3);
        Flower tulip = new Flower("Tulliphé", 1.2);
        Herb rosemary = new Herb("Rosemary", 0.4);
        Herb lavender = new Herb("LavenderEssential", 0.6);

        Carnivore leon = new Carnivore("Little lion man", 5, 0.2, 0.7);
        Herbivore dear = new Herbivore("Bambini", 4, 0.8, 0.5 );
        Carnivore fox = new Carnivore("Victor the adventurer", 7, 0.4, 1.1);
        Herbivore mystic = new Herbivore("MysteriousMammal", 0.1, 0.02, 0.03);
        Herbivore kiwi = new Herbivore("Kiwi", 0.5, 0.2, 0.15);
        Omnivore dog = new Omnivore("Ronaldo", 3.4, 0.3, 0.5);
        Carnivore fish = new Carnivore("Blubb", 0.2, 0.03, 0.06);
        Herbivore butterfly = new Herbivore("Citronella", 0.0004, 0.02, 0.02);
        Omnivore chameleon = new Omnivore("Rainbow", 0.9, 0.2, 0.9);

        //extra test data
        rosemary.setArea(0.5);
        oak.setLeafType(LeafType.HEART);
        tulip.setSmell(Scent.PINEAPPLE);
        bush.setLeafType(LeafType.SPEAR);
        bush.setFruit("Berry");
        leon.setMaxFoodSize(5);
        dear.addPlantToDiet(rosemary);
        dear.addPlantToDiet(lavender);
        dog.addPlantToDiet(tulip);
        dog.addPlantToDiet(bush);
        //END extra test data

        mySecretGarden.addPlant(oak);
        mySecretGarden.addPlant(tulip);
        mySecretGarden.addPlant(bush);
        mySecretGarden.addPlant(lavender);
        mySecretGarden.addPlant(rosemary);
        mySecretGarden.addAnimal(leon);
        mySecretGarden.addAnimal(dear);
        mySecretGarden.addAnimal(fox);
        mySecretGarden.addAnimal(mystic);
        mySecretGarden.addAnimal(kiwi);
        mySecretGarden.addAnimal(dog);
        mySecretGarden.addAnimal(fish);
        mySecretGarden.addAnimal(butterfly);
        mySecretGarden.addAnimal(chameleon);


        //print notebook, plant count and animal count
        mySecretGarden.printNotebook();
        System.out.println();
        System.out.println("Plant count: "+mySecretGarden.getPlantCount());
        System.out.println("Animal count: "+mySecretGarden.getAnimalCount());
        System.out.println();

        //print lists of carnivores, omnivores and herbivores
        System.out.println("Carnivores:");
        mySecretGarden.getCarnivores().forEach(System.out::println);
        System.out.println("Omnivores:");
        mySecretGarden.getOmnivores().forEach(System.out::println);
        System.out.println("Herbivores:");
        mySecretGarden.getHerbivores().forEach(System.out::println);
        System.out.println();

        //sort animals and plants by name and print notebook
        mySecretGarden.sortPlantsByName();
        mySecretGarden.sortAnimalsByName();
        mySecretGarden.printNotebook();

    }
}
