package be.brussel.nature.plants;

public class Tree extends Plant{

    private LeafType leafType;

    public Tree(String name) {
        super(name);
    }

    public Tree(String name, double height) {
        super(name, height);
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return super.toString()+ " The type of plant is a tree, with a " +
                 leafShape(leafType)+ " leaf.";
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
