import instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void before() {
        drum = new Drum("brown", "wood", "bongos", 2);
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



}
