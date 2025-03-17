/*
import java.util.HashSet;
Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato
*/

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        // Creazione di un HashSet di stringhe
        Set<String> set = new HashSet<String>();

        // Aggiunta di elementi all'HashSet
        set.add("Elemento 1");
        set.add("Elemento 2");
        set.add("Elemento 3");

        // Creazione di un oggetto dello stesso tipo dell'HashSet
        String elemento = new String("Elemento 2");

        // Verifica se l'elemento è presente nell'HashSet
        if (set.contains(elemento)) {
            System.out.println("L'elemento " + elemento + " è presente nell'HashSet.");
        } else {
            System.out.println("L'elemento " + elemento + " non è presente nell'HashSet.");
        }
    }
}
