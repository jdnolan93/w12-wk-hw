public abstract class Product implements ISell{

    String description;
    Double buyPrice;
    Double sellPrice;

    public Product(String description, Double buyPrice, Double sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public Double calculateMarkup() {
        return sellPrice - buyPrice;
    }

    public String getDescription() {
        return description;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }
}
