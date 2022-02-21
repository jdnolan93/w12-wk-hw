import instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void before() {
        drum = new Drum("brown", "wood", "bongos", 2, "drum", 20.0, 30.0);
    }

    @Test
    public void canPlay() {
        assertEquals("Bang", drum.play());
    }

    @Test
    public void canGetColour() {
        assertEquals("brown", drum.getColour());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("wood", drum.getMaterial());
    }

    @Test
    public void canGetType(){
        assertEquals("bongos", drum.getType());
    }

    @Test
    public void canGetNoOfDrums(){
        assertEquals(2, drum.getNoOfDrums());
    }

    @Test
    public void canGetDescription() {
        assertEquals("drum", drum.getDescription());
    }

//    @Test
//    public void canGetBuyPrice() {
//        assertEquals(20.0, drum.getBuyPrice());
//    }
//
//    @Test
//    public void canGetSellPrice() {
//        assertEquals(30.0, drum.getSellPrice());
//    }

    @Test
    public void canCalculatePrice() {
        assertEquals(10.0, drum.calculateMarkup(), 0.0);
    }



}
