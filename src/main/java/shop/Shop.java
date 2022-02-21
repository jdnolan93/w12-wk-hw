package shop;

import java.util.ArrayList;

import instruments.Guitar;
import shop.ISell;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop (String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int getStockCount(){
        return stock.size();
    }

    public void addToStock(ISell product) {
        stock.add(product);
    }

    public void removeFromStock(ISell product) {
        stock.remove(product);
    }
}
