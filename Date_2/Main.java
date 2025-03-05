/*
Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
Formatta la data ottenendo 01 marzo 2023
Stampa sulla console
*/

package Date_2;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Creo l'oggetto data di tipo OffsetDateTime:
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        // Formatto la data:
        String dataFormattata = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));

        // Stampo la data formattata:
        System.out.println("Data formattata: " + dataFormattata);
    }
}