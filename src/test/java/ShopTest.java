import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void before(){
        shop = new Shop("Jamie's Music Shop");
    }

    @Test
    public void canGetName(){
        assertEquals("Jamie's Music Shop", shop.getName());
    }

    @Test
    public void canGetEmptyStock(){
        assertEquals(0, shop.getStockCount());
    }
}
