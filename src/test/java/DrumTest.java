import instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void before() {
        drum = new Drum("brown", "wood", "bongs", 2);
    }

    @Test
    public void canPlay() {
        assertEquals("Bang", drum.play());
    }

    @Test
    public void canGetColour() {
        assertEquals("brown", drum.getColour());
    }



}
