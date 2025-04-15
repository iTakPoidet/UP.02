import org.junit.Test;
import static java.lang.Math.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {
    @Test
    public void testCalculateY_xLessThan2() {
        Library lib = new Library();
        double x = 1.0;
        double expected = (2.56 * x + 2) / tan(2 + x);
        double actual = lib.calculateY(x);
        assertEquals(expected, actual, 0.001);
    }
    @Test
    public void testCalculateY_xBetween2And4() {
        Library lib = new Library();
        double x = 3.0;
        double expected = log(x * x - 1);
        double actual = lib.calculateY(x);
        assertEquals(expected, actual, 0.001);
    }
    @Test
    public void testCalculateY_xGreaterThan10() {
        Library lib = new Library();
        double x = 11.0;
        double expected = tan(2.78 * x + 2);
        double actual = lib.calculateY(x);
        assertEquals(expected, actual, 0.001);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testCalculateY_invalidRange() {
        Library lib = new Library();
        lib.calculateY(5.0);
    }
}

