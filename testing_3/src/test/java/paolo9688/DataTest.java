package paolo9688;

import static org.junit.Assert.assertEquals;

import java.time.OffsetDateTime;
import org.junit.Test;

public class DataTest {
    Data data = new Data(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
    
    @Test
    public void getYearTest() {
        int expected = 2023;
        int actual = data.getYear();
        assertEquals(expected, actual);
    }

    @Test
    public void getMonthValueTest() {
        int expected = 3;
        int actual = data.getMonthValue();
        assertEquals(expected, actual);
    }

    @Test
    public void getDayOfMonthTest() {
        int expected = 1;
        int actual = data.getDayOfMonth();
        assertEquals(expected, actual);
    }

    @Test
    public void getDayOfWeekTest() {
        String expected = "WEDNESDAY";
        String actual = data.getDayOfWeek().toString();
        assertEquals(expected, actual);
    }
}
