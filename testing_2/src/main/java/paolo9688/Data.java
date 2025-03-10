/*
Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
Formatta la data ottenendo 01 marzo 2023
Stampa sulla console
Fai attenzione a usare almeno Java 8
Crea dei test per questo esercizio
*/

package paolo9688;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

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

    public String getCostumData() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String costumData = data.format(formatter);
        return costumData;
    }
}
