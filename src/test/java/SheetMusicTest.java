import accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("sheet music", 0.1, 0.5, "Yellow Submarine");
    }

    @Test
    public void canGetDescription() {
        assertEquals("sheet music", sheetMusic.getDescription());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(0.1, sheetMusic.getBuyPrice(), 0.0);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(0.5, sheetMusic.getSellPrice(), 0.0);
    }

    @Test
    public void canCalculatePrice(){
        assertEquals(0.4, sheetMusic.calculateMarkup(), 0.0);
    }

    @Test
    public void canGetSongName(){
        assertEquals("Yellow Submarine", sheetMusic.getSongName());
    }
}
