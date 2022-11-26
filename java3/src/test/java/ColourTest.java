import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class ColourTest {
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
}