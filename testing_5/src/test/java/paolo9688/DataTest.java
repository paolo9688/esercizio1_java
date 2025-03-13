package paolo9688;

import static org.junit.Assert.assertEquals;
import java.time.OffsetDateTime;
import org.junit.Test;

public class DataTest {
    Data data_1 = new Data(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
    Data data_2 = new Data(OffsetDateTime.parse("2024-03-01T13:00:00Z"));

    @Test
    public void isBeforeTest() {
        boolean expected = true;
        boolean actual = data_1.isBefore(data_2);
        assertEquals("c'è stato un errore", expected, actual);
    }

    @Test
    public void isAfterTest() {
        boolean expected = false;
        boolean actual = data_1.isAfter(data_2);
        assertEquals("c'è stato un errore", expected, actual);
    }

    @Test
    public void isEqualTest() {
        boolean expected = false;
        boolean actual = data_1.isEqual(data_2);
        assertEquals("c'è stato un errore", expected, actual);
    }
}
