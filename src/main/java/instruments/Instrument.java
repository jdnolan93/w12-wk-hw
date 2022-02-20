package instruments;

public abstract class Instrument implements IPlay {

    private String colour;
    private String material;
    private String type;

    public Instrument (String colour, String material, String type) {
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
