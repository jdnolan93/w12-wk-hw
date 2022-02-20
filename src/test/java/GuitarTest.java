import instruments.Guitar;
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
}
