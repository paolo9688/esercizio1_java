package paolo9688;

import static org.junit.Assert.assertEquals;

import java.time.OffsetDateTime;
import org.junit.Test;

public class DataTest {
    Data data = new Data(OffsetDateTime.parse("2023-03-01T13:00:00Z"));

    @Test
    public void plusYearsTest() {
        int expected = 2024;
        int actual = data.plusYears(1).getData().getYear();
        assertEquals("l'anno non corrisponde", expected, actual);
    }

    @Test
    public void minusMonthsTest() {
        int expected = 2;
        int actual = data.minusMonths(1).getMonthValue();
        assertEquals("il mese non corrisponde", expected, actual);
    }

    @Test
    public void plusDaysTest() {
        int expected = 8;
        int actual = data.plusDays(7).getDayOfMonth();
        assertEquals("il giorno non corrisponde", expected, actual);
    }

    @Test
    public void formattedDateTest() {
        String expected = "01 marzo 2023";
        String actual = data.formattedDate();
        assertEquals("la formattazione non corrisponde", expected, actual);
    }

    @Test
    public void getMonthValueTest() {
        int expected = 3;
        int actual = data.getMonthValue();
        assertEquals("il mese non corrisponde", expected, actual);
    }

    @Test
    public void getDayOfMonthTest() {
        int expected = 1;
        int actual = data.getDayOfMonth();
        assertEquals("il giorno non corrisponde", expected, actual);
    }

    @Test
    public void getDayOfWeekTest() {
        String expected = "WEDNESDAY";
        String actual = data.getDayOfWeek().toString();
        assertEquals("il giorno della settimana non corrisponde", expected, actual);
    }
}
