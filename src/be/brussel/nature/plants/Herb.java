package be.brussel.nature.plants;

public class Herb extends Plant{

    private double area;

    public Herb(String name) {
        super(name);
    }

    public Herb(String name, double height) {
        super(name, height);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return super.toString()+ " The type of plant is a herb, with an " +
                area+" area.";
    }
}
