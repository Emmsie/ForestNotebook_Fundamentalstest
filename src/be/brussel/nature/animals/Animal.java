package be.brussel.nature.animals;

import java.util.Objects;

public abstract class Animal {

    private String name;
    private double weight;
    private double height;
    private double length;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, double weight, double height, double length) {
        this.name = name;
        setHeight(height);
        setLength(length);
        setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight<0){
            this.weight=0;
        } else {
            this.weight = weight;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<0){
            this.height=0;
        } else {
            this.height = height;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<0){
            this.length=0;
        } else {
            this.length = length;
        }
    }

    @Override
    public String toString() {
        return "  Animal: " +
                "the name is '" + name + '\'' +
                ", the weight is " + weight +
                ", the height is " + height +
                ", the length is " + length +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
