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

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setType(String type) {
        this.type = type;
    }
}
