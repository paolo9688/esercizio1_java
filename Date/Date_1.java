/*
Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni
*/

package Date;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Date_1 {
    public static void main(String[] args) {
        // Creo l'oggetto data di tipo OffsetDateTime:
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        // Formatto la data nei formati full, medium e short:
        String fullData = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String mediumData = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String shortData = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        // Stampo le versioni di data:
        System.out.println("FULL: " + fullData);
        System.out.println("MEDIUM: " + mediumData);
        System.out.println("SHORT: " + shortData);
    }
}
