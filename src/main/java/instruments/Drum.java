package instruments;

public class Drum extends Instrument {

    private int noOfDrums;

    public Drum (String colour, String material, String type, int noOfDrums) {
        super(colour, material, type);
        this.noOfDrums = noOfDrums;
    }

    public String play() {
        return "Bang";
    }

    public int getNoOfDrums() {
        return noOfDrums;
    }
}
