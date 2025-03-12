/*
Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica (Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum
Crei un metodo per calcolare l'operazione richiesta e ritorni il risultato.
Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo
*/

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il primo numero: ");
        BigDecimal big1 = new BigDecimal(scanner.nextLine());

        System.out.println("Inserisci il secondo numero: ");
        BigDecimal big2 = new BigDecimal(scanner.nextLine());

        System.out.println("Scegli l'operazione aritmetica da eseguire (addizione, sottrazione, moltiplicazione, divisione, min, max): ");
        String operazione = scanner.nextLine().toUpperCase();

        try {
            OperazioneAritmetica operazioneAritmetica = OperazioneAritmetica.valueOf(operazione);
            calcola(big1, big2, operazioneAritmetica);
        } catch (IllegalArgumentException e) {
            System.out.println("Operazione non valida");
        } catch (ArithmeticException e) {
            System.out.println("Si è verificato un errore");
        } finally {
            scanner.close();
        }
    }
    
    public static void calcola(BigDecimal big1, BigDecimal big2, OperazioneAritmetica operazione) {
        switch (operazione) {
            case ADDIZIONE:
                System.out.println("Risultato: " + big1.add(big2));
                break;
            case SOTTRAZIONE:
                System.out.println("Risultato: " + big1.subtract(big2));
                break;
            case MOLTIPLICAZIONE:
                System.out.println("Risultato: " + big1.multiply(big2));
                break;
            case DIVISIONE:
                System.out.println("Risultato: " + big1.divide(big2));
                break;
            case MIN:
                System.out.println("Risultato: " + big1.min(big2));
                break;
            case MAX:
                System.out.println("Risultato: " + big1.max(big2));
                break;
            default:
                System.out.println("Operazione non valida");
        }
    }
}
