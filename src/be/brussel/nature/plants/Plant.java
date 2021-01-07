package be.brussel.nature.plants;

import java.util.Objects;

public abstract class Plant {
    private String name;
    private double height;

    public Plant(String name) {
        this.name = name;
    }

    public Plant(String name, double height) {
        this.name = name;
        setHeight(height);
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<0){
            this.height =0;
        } else {
            this.height = height;
        }
    }


    @Override
    public String toString() {
        return "  Plant: " +
                "the plant name is '" + name + '\'' +
                ", the plant height is " + height+".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return Objects.equals(name, plant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
