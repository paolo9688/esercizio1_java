/*
Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.
*/

package Gestione_Errori;

public class Errori_3 {

    // Funzione per dividere un numero per zero:
    public static void divisionByZero(int numeratore) {
        try {
            int divisione = numeratore / 0;
            System.out.println("Il risoltato della divisione è: " + divisione);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("stai tentando di dividere un numero per zero!");
        }
    }

    public static void main(String[] args) {
        // Chiamata della funzione e cattura del messaggio di errore:
        try {
            divisionByZero(3);
        } catch (ArithmeticException e){
            System.out.println("Errore: " + e.getMessage());
        }
    }
}