package instruments;

public class Drum extends Instrument {

    private int noOfDrums;

    public Drum (String colour, String material, String type, int noOfDrums, String description, Double buyPrice, Double sellPrice) {
        super(colour, material, type, description, buyPrice, sellPrice);
        this.noOfDrums = noOfDrums;
    }

    public String play() {
        return "Bang";
    }

    public int getNoOfDrums() {
        return noOfDrums;
    }
}
