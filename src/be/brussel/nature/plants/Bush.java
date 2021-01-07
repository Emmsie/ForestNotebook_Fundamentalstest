package be.brussel.nature.plants;

public class Bush extends Plant{

    private LeafType leafType;
    private String fruit;

    public Bush(String name) {
        super(name);
    }

    public Bush(String name, double height) {
        super(name, height);
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    @Override
    public String toString() {
        return super.toString()+ " The type of plant is a bush, with a " +
                 leafShape(leafType) +
                " leaf and the fruit " + fruit +
                "." ;
    }

    private String leafShape(LeafType leafType){
        String shape ="";
        switch(leafType){
            case NEEDLE:
                shape = "needle";
                break;
            case ROUND:
                shape = "round";
                break;
            case HAND:
                shape ="hand";
                break;
            case HEART:
                shape ="heart";
                break;
            case SPEAR:
                shape ="spear";
                break;
        }

        return shape;
    }
}
