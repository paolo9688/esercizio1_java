/*
Scrivere una funzione che accetti in input 2 int e ne stampi la somma
Scrivere una funzione che accetti in input 1 char lo stampi
Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
Scrivere una funzione che accetti in input 1 Character lo stampi
Scrivere un valore primitivo per int, double e char e fare autoboxing
Scrivere un oggetto per Integer, Double e Character e fare Unboxing
Usare le funzioni scritte con i valori creati
*/

package Autoboxing_Unboxing;

public class Auto_Un_boxing {
    public static void main(String[] args) {

        // AUTOBOXING:

        // elementi primitivi:
        int numero = 5;
        double numeroDouble = 5.5;
        char carattere = 'a';
        // elementi non primitivi:
        Integer nuovoNumero = numero;
        Double oggettoDouble = numeroDouble;
        Character oggettoCharacter = carattere;
        // stampa elementi primitivi e non primitivi:
        System.out.println("\nNumero primitivo: " + numero);
        System.out.println("Numero non primitivo: " + nuovoNumero);
        System.out.println("\nDouble primitivo: " + numeroDouble);
        System.out.println("Double non primitivo: " + oggettoDouble);
        System.out.println("\nCarattere primitivo: " + carattere);
        System.out.println("Carattere non primitivo: " + oggettoCharacter);

        // UNBOXING:

        // elementi non primitivi:
        Integer numeroInteger = 8;
        Double nuovoDouble = 3.3;
        Character nuovoCharacter = 'c';
        // elementi primitivi:
        int numeroPrimitivo = numeroInteger;
        double doublePrimitivo = nuovoDouble;
        char charPrimitivo = nuovoCharacter;
        // stampa elementi primitivi e non primitivi:
        System.out.println("\nNumero primitivo: " + numeroPrimitivo);
        System.out.println("Numero non primitivo: " + numeroInteger);
        System.out.println("\nDouble primitivo: " + doublePrimitivo);
        System.out.println("Double non primitivo: " + nuovoDouble);
        System.out.println("\nCarattere primitivo: " + charPrimitivo);
        System.out.println("Carattere non primitivo: " + nuovoCharacter);

        int somma = sommaInt(numero, numeroPrimitivo);
        System.out.println("\nSomma tra elementi primitivi: " + somma);

        System.out.print("\nStampa di un carattere primitivo: ");
        stampaChar(carattere);

        Integer nuovaSomma = sommaInteger(nuovoNumero, numeroInteger);
        System.out.println("\nStampa della somma tra due oggetti Integer con unboxing del risultato: " + nuovaSomma);

        System.out.print("\nStampa di un oggetto Character non primitivo con unboxing del risultato: ");
        stampaCharacter(nuovoCharacter);
    }

    public static int sommaInt(int num1, int num2) {
        int somma = num1 + num2;
        return somma;
    }

    public static void stampaChar(char carattere) {
        System.out.println(carattere);
    }

    public static int sommaInteger(Integer num1, Integer num2) {
        int somma = num1 + num2;
        return somma;
    }

    public static void stampaCharacter(Character carattere) {
        char nuovoCarattere = carattere;
        System.out.println(nuovoCarattere);
    }
}
