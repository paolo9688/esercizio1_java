// Creare un hashmap, prendere tutti i valori, ordinarli e stamparli

package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap_2 {
    public static void main(String[] args) {
        // Create a new HashMap object
        Map<Integer, String> map = new HashMap<Integer, String>();

        // Add key-value pairs to the HashMap
        map.put(1, "Fiat");
        map.put(2, "Ford");
        map.put(3, "Renault");
        map.put(4, "Peugeot");
        map.put(5, "Citroen");

        // Print the values of the HashMap
        System.out.println(map.values());

        // Create a new ArrayList from the values of the HashMap
        List<String> list = new ArrayList<String>(map.values());

        // Sort the ArrayList in ascending order
        Collections.sort(list);

        // Print the sorted ArrayList
        System.out.println(list);
    }
}
