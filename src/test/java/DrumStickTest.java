import accessories.DrumStick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void before() {
        drumStick = new DrumStick("drumstick", 0.50, 1.0);
    }

    @Test
    public void canGetDescription() {
        assertEquals("drumstick", drumStick.getDescription());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(0.5, drumStick.getBuyPrice(), 0.0);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(1.0, drumStick.getSellPrice(), 0.0);
    }

    @Test
    public void canCalculatePrice(){
        assertEquals(0.5, drumStick.calculateMarkup(), 0.0);
    }
}
