package instruments;

public class Guitar extends Instrument {

    private int noOfStrings;

    public Guitar(String colour, String material, String type, int noOfStrings, String description, Double buyPrice, Double sellPrice) {
        super(colour, material, type, description, buyPrice, sellPrice);
        this.noOfStrings = noOfStrings;
    }

    public String play() {
        return "Kerrang";
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }
}
