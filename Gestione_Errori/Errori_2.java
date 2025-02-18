/*
Scrivere una funzione che controlli se un carattere è un numero, altrimenti lanciare una eccezione.
*/

package Gestione_Errori;

import java.util.Scanner;

class ControlloCarattere {
    private char carattere;

    public ControlloCarattere(char carattere) {
        this.carattere = carattere;
    }

    public boolean isInteger() {
        if (Character.isDigit(carattere)) {
            return true;
        } else {
            throw new IllegalArgumentException("Il carattere inserito non è un numero.");
        }
    }
}

public class Errori_2 {
    public static void main(String[] args) {
        // Inizializzazione scanner:
        Scanner scanner = new Scanner(System.in);

        //Input carattere per verifica metodo:
        System.out.println("Inserisci un carattere: ");
        char carattere = scanner.next().charAt(0);

        // Creazione di una nuova istanza della classe ControlloRange:
        ControlloCarattere primoControllo = new ControlloCarattere(carattere);

        // Verifica del carattere ed eventuale lancio dell'eccezione:
        try {
            if (primoControllo.isInteger() == true) {
                System.out.println("Il carattere inserito è un numero.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}