import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MATest {

    @Test
    void function() {
        double actual = MA.function(1);
        assertEquals(MA.function(1),actual);
    }

    @Test
    void leftRectangleMethod() {
        double actual = MA.leftRectangleMethod(1,2,3);
        assertEquals(MA.leftRectangleMethod(1,2,3), actual);
    }

    @Test
    void rightRectangleMethod() {
        double actual = MA.rightRectangleMethod(1,2,3);
        assertEquals(MA.rightRectangleMethod(1,2,3), actual);
    }
}