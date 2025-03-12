/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
aggiungi un anno
sottrai un mese
aggiungi 7 giorni
Stampa la data localizzata per l'Italia
Crea dei test per questo esercizio
*/

package paolo9688;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        // Istanzio l'oggetto data:
        Data data = new Data(OffsetDateTime.parse("2023-03-01T13:00:00Z"));

        // Stampo la data originale:
        System.out.println(data);

        // Creo la data aggiornata e la pongo uguale a data:
        Data dataAggiornata = data;

        // Aggiungo un anno alla data aggiornata:
        dataAggiornata = dataAggiornata.plusYears(1);

        // Sottraggo un mese alla data aggiornata:
        dataAggiornata = dataAggiornata.minusMonths(1);

        // Aggiungo 7 giorni alla data aggiornata:
        dataAggiornata = dataAggiornata.plusDays(7);

        // Stampo la data aggiornata:
        System.out.println(dataAggiornata);

        // Data originale formattata:
        String dataFormattata = data.formattedDate();
        
        // Data aggiornata formattata:
        String dataAggiornataFormattata = dataAggiornata.formattedDate();

        // Stampo la data originale formattata:
        System.out.println("Data originale formattata: " + dataFormattata);

        // Stampo la data aggiornata formattata:
        System.out.println("Data aggiornata formattata: " + dataAggiornataFormattata);
    }
}
