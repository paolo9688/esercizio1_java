/*
Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array per 0
e gestisca sia l'eccezione della divisione che quella di indice non presente nell'array, leggendone il messaggio.
Eseguire sempre un blocco di codice scrivendo un messaggio in console.
*/

package Gestione_Errori;

public class Errori_4 {
    
    // Creazione della funzione che, dato un array di interi e un indice, esegue la divisione per zero di un numero dell'array:
    public static void divisionByZero(int[] numeri, int indice) {
        try {
            int divisione = numeri[indice] / 0;
            System.out.println("Il risoltato della divisione è: " + divisione);
        } catch (ArithmeticException firstError) {
            throw new ArithmeticException("stai tentando di dividere un numero per zero!");
        } catch (ArrayIndexOutOfBoundsException  secondError) {
            throw new ArrayIndexOutOfBoundsException ("l'indice dell'array a cui stai tentando di accedere non esiste!");
        }
    }
    
    public static void main(String[] args) {

        // Creazione di un array numerico:
        int[] numeri = {1, 2, 3, 4, 5};
        int lunghezzaArray = numeri.length;

        // Chiamata della funzione e cattura del messaggio di errore nel caso di divisione per zero:
        try {
            divisionByZero(numeri, lunghezzaArray - 1);
        } catch (ArithmeticException firstError){
            System.out.println("Errore: " + firstError.getMessage());
        } catch (ArrayIndexOutOfBoundsException  secondError) {
            System.out.println("Errore: " + secondError.getMessage());
        }

        // Chiamata della funzione e cattura del messaggio di errore nel caso di indice dell'array non valido:
        try {
            divisionByZero(numeri, lunghezzaArray + 1);
        } catch (ArithmeticException firstError){
            System.out.println("Errore: " + firstError.getMessage());
        } catch (ArrayIndexOutOfBoundsException  secondError) {
            System.out.println("Errore: " + secondError.getMessage());
        }
    }
}