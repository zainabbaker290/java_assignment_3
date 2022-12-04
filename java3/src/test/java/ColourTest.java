import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * this class is used to test the colour class
 */
public class ColourTest {
    /**
     * the following three tests, test if the values match the required values
     */
    @Test
    public void testDisplayRedColourTest() {
        Colour brown = new Colour(0.59,0.0,0.0);
        assertEquals(brown.red, 0.59, 0.59);

    }
    @Test
    public void testDisplayGreenColourTest() {
        Colour brown = new Colour(0.0,0.29,0.0);
        assertEquals(brown.green, 0.29, 0.29);
    }
    @Test
    public void testDisplayBlueColourTest() {
        Colour brown = new Colour(0.0,0.0,0.0);
        assertEquals(brown.blue, 0.0, 0.0);
    }

    /**
     * the following three tests, test if the values entered are within range
     */
    @Test
    public void exceptionRedTest(){
        assertThrows(IllegalArgumentException.class, () -> new Colour(7,0,0));
    }

    @Test
    public void exceptionGreenTest(){
        assertThrows(IllegalArgumentException.class, () -> new Colour(0,5,0));
    }

    @Test
    public void exceptionBlueTest(){
        assertThrows(IllegalArgumentException.class, () -> new Colour(0,0,8));
    }

    /**
     * Tests the constructor for a Colour object which is a combined RGB value
     */
    @Test
    public void RGBMixed(){
        Colour black = new Colour(new int[] {0x00,0x00,0x00});
        assertEquals(black.red, 0x00, 0.0);
        assertEquals(black.green, 0x00, 0.0);
        assertEquals(black.blue, 0x00,0.0);
    }

    /**
     * Tests if two instances of the colour object are equal to each other
     */
    @Test
    public void equalColours() {
        Colour black1 = new Colour(0.0,0.0,0.0);
        Colour black2 = new Colour(0.0,0.0,0.0);
        assertEquals(black1.red, black2.red, 0.0);
        assertEquals(black1.green, black2.green, 0.0);
        assertEquals(black1.blue, black2.blue,0.0);
    }
}