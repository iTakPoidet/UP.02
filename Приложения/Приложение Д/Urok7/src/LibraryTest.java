import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
Library lib = new Library();
    @Test
    void proverka() {
        assertEquals(false, lib.proverka(0));
        assertEquals(true, lib.proverka(1));
    }

    @Test
    void generationMass() {

    }

    @Test
    void display() {

    }

    @Test
    void filter() {

    }
}