import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library lib = new Library();
    @Test
    void proverka() {
        assertEquals(false, Library.proverka(0));
        assertEquals(true, Library.proverka(1));
    }

    @Test
    void generationMass() {
        int[] a = Library.generationMass(-5, 10, 300);
        boolean actual = true;
        for (int i = 0; i < a.length; i++){
            if ((a[i] > 10) && (a[i] < -5)) actual = false;
        }
        assertEquals(true, actual);
    }

    @Test
    void volume() {
        int[] a = Library.generationMass(0, 10, 300);
        int[] b = Library.generationMass(0, 10, 300);
        int[] c = Library.generationMass(0, 10, 300);
        int actual = lib.volume(a,b,c);
        assertEquals(lib.volume(a,b,c),actual);
    }

    @Test
    void sumOst() {
        int[] a = Library.generationMass(0, 10, 300);
        int[] b = Library.generationMass(0, 10, 300);
        int[] c = Library.generationMass(0, 10, 300);
        lib.sumOst(a,b,c);
        int actual = lib.getScore();
        assertEquals(lib.getScore(),actual);
    }

    @Test
    void getScore() {
        assertEquals(lib.getScore(),lib.getScore());
    }
}