package instruments;

import instruments.Instrument;

public class Guitar extends Instrument {

    private int noOfStrings;

    public Guitar(String colour, String material, String type, int noOfStrings) {
        super(colour, material, type);
        this.noOfStrings = noOfStrings;
    }

    public String play() {
        return "Kerrang";
    }

}
