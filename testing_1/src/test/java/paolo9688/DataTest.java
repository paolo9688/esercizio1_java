package paolo9688;

import static org.junit.Assert.assertEquals;

import java.time.OffsetDateTime;
import org.junit.Test;

public class DataTest {
    Data data = new Data(OffsetDateTime.parse("2002-03-01T13:00:00Z"));

    @Test
    public void fullDataTest() {
        String expected = "venerdì 1 marzo 2002";
        String actual = data.getFullData();
        assertEquals(expected, actual);
    }

    @Test
    public void mediumDataTest() {
        String expected = "1 mar 2002";
        String actual = data.getMediumData();
        assertEquals(expected, actual);
    }

    @Test
    public void shortDataTest() {
        String expected = "01/03/02";
        String actual = data.getShortData();
        assertEquals(expected, actual);
    }
}
