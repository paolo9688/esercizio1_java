package paolo9688;

import static org.junit.Assert.assertEquals;

import java.time.OffsetDateTime;
import org.junit.Test;

public class DataTest {
    Data data = new Data(OffsetDateTime.parse("2023-03-01T13:00:00Z"));

    @Test
    public void costumDataTest() {
        String expected = "01 marzo 2023";
        String actual = data.getCostumData();
        assertEquals(expected, actual);
    }
}
