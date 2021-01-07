package be.brussel.nature.plants;

public class Flower extends Plant{

    private Scent smell;

    public Flower(String name) {
        super(name);
    }

    public Flower(String name, double height) {
        super(name, height);
    }

    public Scent getSmell() {
        return smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return  super.toString()+ " The type of plant is a flower, with a " +
                 smell(smell) +
                " smell.";
    }

    private String smell(Scent smell){
        String scent ="";
        switch(smell){
            case SWEET:
                scent = "sweet";
                break;
            case ORANGE:
                scent = "orange";
                break;
            case PINEAPPLE:
                scent ="pineapple";
                break;
            case MUSKY:
                scent ="musky";
                break;
            case EARTHY:
                scent ="earthy";
                break;
            case SOUR:
                scent ="sour";
                break;
        }

        return scent;
    }
}
