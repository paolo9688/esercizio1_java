/*
Scrivere una funzione che restituisca un hashset riempito
Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
Svuotare l'hashset, verificarlo e stampare il risultato
*/

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> hashSet = riempiHashSet();
        System.out.println("HashSet iniziale: " + hashSet);

        String oggettoDaCercare = "Elemento 2";
        Set<String> nuovoHashSet = new HashSet<>();

        for (String elemento : hashSet) {
            if (!elemento.equals(oggettoDaCercare)) {
                nuovoHashSet.add(elemento);
            }
        }

        hashSet.clear();
        System.out.println("HashSet dopo l'eliminazione: " + hashSet);
        System.out.println("Nuovo HashSet: " + nuovoHashSet);
    }

    public static Set<String> riempiHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Elemento 1");
        hashSet.add("Elemento 2");
        hashSet.add("Elemento 3");
        return hashSet;
    }
}
