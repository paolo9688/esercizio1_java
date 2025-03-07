/*
Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni -Crea dei test per questo esercizio
*/

package paolo9688;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Data {
    private OffsetDateTime data;

    public Data(OffsetDateTime data) {
        this.data = data;
    }

    public OffsetDateTime getData() {
        return data;
    }

    public void setData(OffsetDateTime data) {
        this.data = data;
    }

    public String toString() {
        return "Data{" +
                "data=" + data +
                '}';
    }

    public String getFullData() {
    String fullData = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    return fullData;
    }

    public String getMediumData() {
        String mediumData = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        return mediumData;
    }

    public String getShortData() {
        String shortData = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        return shortData;
    }
}
