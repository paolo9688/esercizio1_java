/*
Scrivi un programma Java che abbia un metodo che prenda due stringhe e le compari lessico-graficamente.
Il metodo dovrà restituire "Le due stringhe sono uguali" o "Le due stringhe sono differenti" basandosi sul risultato del confronto.
Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.
*/

package Stringhe;

import java.util.Scanner;

class Confronto {
    private String primaStringa;
    private String secondaStringa;

    public Confronto(String primaStringa, String secondaStringa) {
        this.primaStringa = primaStringa;
        this.secondaStringa = secondaStringa;
    }

    public String confronto() {
        StringBuilder risposta = new StringBuilder();
        int confronto = primaStringa.compareTo(secondaStringa);
        if (confronto == 0) {
            risposta.append("Le due stringhe sono uguali");
        } else {
            risposta.append("Le due stringhe sono differenti");
        }
        return risposta.toString();
    }
}

public class Stringhe_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la prima frase: ");
        String primaStringa = scanner.nextLine();
        System.out.println("Inserisci la seconda frase: ");
        String secondaStringa = scanner.nextLine();
        Confronto primoConfronto = new Confronto(primaStringa, secondaStringa);
        String esitoConfronto = primoConfronto.confronto();
        System.out.println(esitoConfronto);
        scanner.close();
    }
}