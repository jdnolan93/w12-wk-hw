package shop;

import java.util.ArrayList;
import shop.ISell;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop (String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }
}
