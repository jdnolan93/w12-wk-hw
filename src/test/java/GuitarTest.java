import instruments.Guitar;
import instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("black", "metal", "electric", 4);
    }

    @Test
    public void canPlay() {
        assertEquals("Kerrang", guitar.play());
    }

    @Test
    public void canGetColour() {
        assertEquals("black", guitar.getColour());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("metal", guitar.getMaterial());
    }
}
