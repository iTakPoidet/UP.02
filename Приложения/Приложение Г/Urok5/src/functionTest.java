import static org.junit.jupiter.api.Assertions.*;

class functionTest {
    function f = new function();

    @org.junit.jupiter.api.Test
    void function1() {
        double actual = f.function1(3);
        assertEquals(f.function1(3), actual);
    }

    @org.junit.jupiter.api.Test
    void function2() {
        double actual = f.function2(3);
        assertEquals(f.function2(3), actual);
    }

    @org.junit.jupiter.api.Test
    void leftRectangleMethod() {
        double actual = f.leftRectangleMethod(1,5,1,1);
        assertEquals(f.leftRectangleMethod(1,5,1,1), actual);
        double actual1 = f.leftRectangleMethod(1,5,1,2);
        assertEquals(f.leftRectangleMethod(1,5,1,2), actual1);
    }

    @org.junit.jupiter.api.Test
    void rightRectangleMethod() {
        double actual = f.rightRectangleMethod(1,5,1,1);
        assertEquals(f.rightRectangleMethod(1,5,1,1), actual);
        double actual1 = f.rightRectangleMethod(1,5,1,2);
        assertEquals(f.rightRectangleMethod(1,5,1,2), actual1);
    }
}