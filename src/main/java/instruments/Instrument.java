package instruments;

import shop.Product;

public abstract class Instrument extends Product implements IPlay {

    private String colour;
    private String material;
    private String type;

    public Instrument (String colour, String material, String type, String description, Double buyPrice, Double sellPrice) {
        super(description, buyPrice, sellPrice);
        this.colour = colour;
        this.material = material;
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type;
    }
}
