/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console
Crea dei test per questo esercizio
*/

package paolo9688;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        // Creo l'oggetto data:
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        // Ottengo i valori di anno, mese, giorno e giorno della settimana:
        int anno = data.getYear();
        int mese = data.getMonthValue();
        int giorno = data.getDayOfMonth();
        String giornoSettimana = data.getDayOfWeek().toString();

        // Stampo i risultati:
        System.out.println("Anno: " + anno);
        System.out.println("Mese: " + mese);
        System.out.println("Giorno: " + giorno);
        System.out.println("Giorno della settimana: " + giornoSettimana);
    }
}
