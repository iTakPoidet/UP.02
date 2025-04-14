import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class massivTest {
    massiv mas = new massiv();
    private String[] stud = new String[]{"Ив", "Пет", "Сид", "Вас"};
    private int[] oc = new int[]{5, 4, 3, 2};

    @Test
    void otl() {
        String[] expected = {"Ив"};
        String[] actual = mas.otl(stud, oc);
        assertArrayEquals(expected, actual);
    }

    @Test
    void sredoc() {
        int expected = (5 + 4 + 3 + 2) / 4;
        int actual = mas.sredoc(oc);
        assertEquals(expected, actual);
    }

    @Test
    void xor() {
        String[] expected = {"Пет"};
        String[] actual = mas.xor(stud, oc);
        assertArrayEquals(expected, actual);
    }

    @Test
    void tryki() {
        String[] expected = {"Сид"};
        String[] actual = mas.tryki(stud, oc);
        assertArrayEquals(expected, actual);
    }

    @Test
    void dolzhniki() {
        String[] expected = {"Вас"};
        String[] actual = mas.dolzhniki(stud, oc);
        assertArrayEquals(expected, actual);
    }
}