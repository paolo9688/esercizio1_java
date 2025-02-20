/*
Scrivere una funzione che accetti in input un numeratore e un denominatore
Controlli che il numeratore e il denominatore non siano null
Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.
*/

package Nullability;

public class Null {
    
    // Creazione della funzione che, dato un numeratore e un denominatore, verifichi che i due numeri non siano null:
    public static double nullCheck(Integer numeratore, Integer denominatore) {
        if (numeratore == null || denominatore == null) {
            throw new IllegalArgumentException("I numeri inseriti non possono essere null!");
        }
        if (denominatore == 0) {
            throw new ArithmeticException("Il denominatore deve essere diverso da zero!");
        }
        double risultato = numeratore / denominatore;
        return risultato;
    }
    
    public static void main(String[] args) {

        // Chiamata della funzione e cattura del messaggio di errore nel caso di almeno un numero null:
        try {
            double risultato = nullCheck(null, 5);
            System.out.println("Il risultato della divisione è: " + risultato);
        } catch (IllegalArgumentException firstError) {
            System.out.println("Errore: " + firstError.getMessage());
        } catch (ArithmeticException secondError) {
            System.out.println("Errore " + secondError.getMessage());
        }

        // Chiamata della funzione e cattura del messaggio di errore nel caso di denominatore zero:
        try {
            double risultato = nullCheck(5, 0);
            System.out.println("Il risultato della divisione è: " + risultato);
        } catch (IllegalArgumentException firstError) {
            System.out.println("Errore: " + firstError.getMessage());
        } catch (ArithmeticException secondError) {
            System.out.println("Errore: " + secondError.getMessage());
        }
    }
}