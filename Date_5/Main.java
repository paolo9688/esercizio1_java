/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
Verificare che la prima data è precedente alla seconda
Verificare che la seconda data è successiva alla prima
Verificare che le due date sono uguali ad ora
Stampa il risultato
*/

package Date_5;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        // Creo l'oggetto data_1:
        OffsetDateTime data_1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        // Creo l'oggetto data_2:
        OffsetDateTime data_2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        // Verifico se la prima data è precedente alla seconda:
        boolean precedente = data_1.isBefore(data_2);

        // Verifico se la seconda data è successiva alla prima:
        boolean successiva = data_2.isAfter(data_1);
        
        // Verifico se le due date sono uguali ad ora:
        boolean uguali = data_1.isEqual(data_2);

        // Stampo i risultati:
        System.out.println("La prima data è precedente alla seconda: " + precedente);
        System.out.println("La seconda data è successiva alla prima: " + successiva);
        System.out.println("Le due date sono uguali ad ora: " + uguali);
    }
}
