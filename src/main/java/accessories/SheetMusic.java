package accessories;

import shop.Product;

public class SheetMusic extends Product {

    private String songName;

    public SheetMusic(String description, Double buyPrice, Double sellPrice, String songName) {
        super(description, buyPrice, sellPrice);
        this.songName = songName;
    }

    public String getSongName() {
        return songName;
    }
}
