// Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto

package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_1 {
    public static void main(String[] args) {
        //primo metodo di inizializzazione di un hashmap:
        Map<String, String> mappa1 = new HashMap<>();

        mappa1.put("1", "One");
        mappa1.put("2", "Two");
        mappa1.put("3", "Three");

        System.out.println(mappa1);

        //secondo metodo di inizializzazione di un hashmap:
        Map<String, String> mappa2 = Map.of("1", "One", "2", "Two", "3", "Three");

        System.out.println(mappa2);

        //terzo metodo di inizializzazione di un hashmap:
        Map<String, String> mappa3 = Map.ofEntries(
                Map.entry("1", "One"),
                Map.entry("2", "Two"),
                Map.entry("3", "Three")
        );

        System.out.println(mappa3);
    }
}
