import org.junit.Before;
import org.junit.Test;
import shop.Shop;
import instruments.Guitar;
import accessories.SheetMusic;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    SheetMusic sheetMusic;

    @Before
    public void before(){
        shop = new Shop("Jamie's Music Shop");
        guitar = new Guitar("brown", "oak", "guitar", 5, "guitar", 50.0, 100.0);
        sheetMusic = new SheetMusic("sheet music", 0.1, 0.5, "Despacito");
    }

    @Test
    public void canGetName(){
        assertEquals("Jamie's Music Shop", shop.getName());
    }

    @Test
    public void canGetEmptyStock(){
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddToStock(){
        shop.addToStock(guitar);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addToStock(guitar);
        shop.addToStock(guitar);
        shop.addToStock(sheetMusic);
        shop.removeFromStock(guitar);
        assertEquals(2, shop.getStockCount());
    }
}
