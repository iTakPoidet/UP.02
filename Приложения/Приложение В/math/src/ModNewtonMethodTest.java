import static org.junit.jupiter.api.Assertions.*;

class ModNewtonMethodTest {

    @org.junit.jupiter.api.Test
    void function() {
        double actual = ModNewtonMethod.function(1,1);
        assertEquals(ModNewtonMethod.function(1,1),actual);
    }

    @org.junit.jupiter.api.Test
    void derivative() {
        double actual = ModNewtonMethod.derivative(1);
        assertEquals(ModNewtonMethod.derivative(1),actual);
    }

    @org.junit.jupiter.api.Test
    void modifiedNewton() {
        double actual = ModNewtonMethod.modifiedNewton(1,3);
        assertEquals(ModNewtonMethod.modifiedNewton(1,3),actual);
    }

    @org.junit.jupiter.api.Test
    void simpleIteration() {
        double actual = ModNewtonMethod.simpleIteration(1,3);
        assertEquals(ModNewtonMethod.simpleIteration(1,3),actual);
    }
}