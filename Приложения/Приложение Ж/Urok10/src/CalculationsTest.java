import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
class CalculationsTest {
    @Test
    public void AvailablePeriods() {
        String[] startTimes = {"9:00", "10:30", "12:00"};
        int[] prodolzh = {60, 30, 90};
        int Otrezok = 30;
        String beginWorking = "9:00";
        String endWorking = "13:00";
        ArrayList<String> expected = new ArrayList<>();
        expected.add("11:00\t-\t11:30");

        ArrayList<String> actual = Calculations.availablePeriods(startTimes, prodolzh, Otrezok, beginWorking, endWorking);
        assertEquals(expected, actual);
    }

    @Test
    public void TimeToMinutes() {
        assertEquals(0, Calculations.timeToMinutes("0:00"));
        assertEquals(60, Calculations.timeToMinutes("1:00"));
        assertEquals(90, Calculations.timeToMinutes("1:30"));
        assertEquals(120, Calculations.timeToMinutes("2:00"));
        assertEquals(150, Calculations.timeToMinutes("2:30"));
        assertEquals(180, Calculations.timeToMinutes("3:00"));
        assertEquals(240, Calculations.timeToMinutes("4:00"));
    }
    @Test
    public void MinutesToTime() {
        assertEquals("0:00", Calculations.minutesToTime(0));
        assertEquals("1:00", Calculations.minutesToTime(60));
        assertEquals("1:30", Calculations.minutesToTime(90));
        assertEquals("2:00", Calculations.minutesToTime(120));
        assertEquals("2:30", Calculations.minutesToTime(150));
        assertEquals("3:00", Calculations.minutesToTime(180));
        assertEquals("4:00", Calculations.minutesToTime(240));
    }
}