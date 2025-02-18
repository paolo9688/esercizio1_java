/*
Scrivere una funzione che controlli se un numero int è in un determinato range. Se lo è, ritorna true; se non lo è, lancia un'eccezione.
*/

package Gestione_Errori;

/*public class Errori_1 {

    public static boolean isInRange(int number, int min, int max) {
        if (number >= min && number <= max) {
            return true;
        } else {
            throw new ArithmeticException("Il numero non è nel range specificato.");
        }
    }

    public static void main(String[] args) {
        int numeroDaControllare = 25;
        int limiteInferiore = 10;
        int limiteSuperiore = 20;

        try {
            if (isInRange(numeroDaControllare, limiteInferiore, limiteSuperiore)) {
                System.out.println(numeroDaControllare + " è nel range.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}*/

import java.util.Scanner;

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
        if (n >= minRange && n <= maxRange) {
            return true;
        } else {
            throw new ArithmeticException("Il numero non è nel range specificato.");
        }
    }
}

public class Errori_1 {
    public static void main(String[] args) {
        // Inizializzazione scanner:
        Scanner scanner = new Scanner(System.in);

        //Input numeri per verifica metodo:
        System.out.println("Inserisci il numero soggetto della verifica: ");
        int numero = scanner.nextInt();
        System.out.println("Inserisci il margine inferiore del range: ");
        int min = scanner.nextInt();
        System.out.println("Inserisci il margine superiore del range: ");
        int max = scanner.nextInt();

        // Creazione di una nuova istanza della classe ControlloRange:
        ControlloRange primoControllo = new ControlloRange(numero, min, max);

        // Verifica dell'intervallo ed eventuale lancio dell'eccezione:
        try {
            if (primoControllo.verifica() == true) {
                System.out.println("Il numero è all'interno del range indicato.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}