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
}
