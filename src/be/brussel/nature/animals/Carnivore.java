package be.brussel.nature.animals;

public class Carnivore extends Animal{

    private double maxFoodSize;

    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
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
        return super.toString()+ " The type of animal is a carnivore:" +
                "\n   the maximum food size is " + maxFoodSize +
                ".";
    }
}
