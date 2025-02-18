/*
Scrivere una funzione che controlli se un numero int è in un determinato range. Se lo, è ritorna true ; se non lo è, lancia un'eccezione.
*/

package Gestione_Errori;

class ControlloRange {
    private int n;
    private int minRange;
    private int maxRange;

    public ControlloRange(int n, int minRange, int maxRange) {
        this.n = n;
        this.minRange = minRange;
        this.maxRange = maxRange;
    }

    public boolean verifica() {
        try {
            if (n >= minRange && n <= maxRange) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e){
            throw new ArithmeticException("Errore: " + e);
        }
        
    }
}

public class Errori_1 {
    public static void main(String[] args) {
        // Creazione di una nuova istanza della classe ControlloRange:
        ControlloRange primoControllo = new ControlloRange(1, 3, 10);

        // Verifica dell'intervallo ed eventuale lancio dell'eccezione:
        boolean verifica = primoControllo.verifica();
        /*
        try {
            if (verifica) {
                System.out.println("Il numero è all'interno del range indicato.");
            }
        } catch (Exception e) {
            System.out.println("Errore: " + e);
        }*/
    }
}