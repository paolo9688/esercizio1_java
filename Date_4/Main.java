/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
aggiungi un anno
sottrai un mese
aggiungi 7 giorni
Stampa il risultato localizzata per l'Italia
*/

package Date_4;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Creo l'oggetto data:
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        // Aggiungo un anno:
        OffsetDateTime dataAggiornata = data.plusYears(1);

        // Sottraggo un mese:
        dataAggiornata = dataAggiornata.minusMonths(1);

        // Aggiungo 7 giorni:
        dataAggiornata = dataAggiornata.plusDays(7);

        // Data originale formattata:
        String dataFormattata = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));

        // Data aggiornata formattata:
        String dataAggiornataFormattata = dataAggiornata.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));

        // Stampo la data originale formattata:
        System.out.println("Data originale: " + dataFormattata);

        // Stampo il risultato localizzato per l'Italia:
        System.out.println("Data aggiornata: " + dataAggiornataFormattata);
    }
}
