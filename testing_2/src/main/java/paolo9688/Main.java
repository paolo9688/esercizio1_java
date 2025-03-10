package paolo9688;

// Questo codice utilizza le API java.time introdotte in Java 8, che sono consigliate per la gestione di date e orari.

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        // inizializzo una nuova data della classe Data con la stringa richiesta:
        Data data = new Data(OffsetDateTime.parse("2023-03-01T13:00:00Z"));

        // stampo la data con il formato richiesto attraverso il metodo getCostumData():
        System.out.println("Data: " + data.getCostumData());
    }
}
