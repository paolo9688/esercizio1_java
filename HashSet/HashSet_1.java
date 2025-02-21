/*
Scrivere una funzione che restituisca un hashset riempito
Leggere l'hashSet e stampre grandezza ed elementi
*/

package HashSet;

import java.util.HashSet;

public class HashSet_1 {
    public static void main(String[] args) {
        HashSet<Integer> elenco = funzioneHashSet(15);
        System.out.print("L'HashSet inserito ha dimensione: " + elenco.size() + "\n");
        System.out.print("Questi sono gli elementi dell'HashSet: ");
        System.out.println(elenco);
    }

    // Funzione che restituisce un HashSet riempito:
    public static HashSet<Integer> funzioneHashSet(int dimensione) {
        HashSet<Integer> hashSetRiempito = new HashSet<Integer>();
        for (int i = 0; i < dimensione; i++) {
            hashSetRiempito.add(i);
        }
        return hashSetRiempito;
    }
}