package Stringhe;

class CarattereUnicode {

    private String stringa;
    private int posizione;

    public CarattereUnicode(String stringa, int posizione) {
        this.stringa = stringa;
        this.posizione = posizione;
    }

    public String getCarattereUnicode() {
        StringBuilder risultato = new StringBuilder();

        if (stringa == null || stringa.isEmpty()) {
            risultato.append("Errore: La stringa è vuota o null.");
        } else if (posizione < 0 || posizione >= stringa.length()) {
            risultato.append("Errore: Posizione non valida.");
        } else {
            char carattere = stringa.charAt(posizione);
            int codiceUnicode = (int) carattere; // Ottiene il codice Unicode del carattere

            risultato.append("Il carattere in posizione ").append(posizione)
                    .append(" è '").append(carattere).append("'")
                    .append(" e il suo codice Unicode è ").append(codiceUnicode);
        }

        return risultato.toString();
    }
}

public class Stringhe_2 {
    public static void main(String[] args) {
        CarattereUnicode c1 = new CarattereUnicode("Hello", 1);
        System.out.println(c1.getCarattereUnicode());

        CarattereUnicode c2 = new CarattereUnicode("Java", 5);
        System.out.println(c2.getCarattereUnicode());

        CarattereUnicode c3 = new CarattereUnicode("", 0);
        System.out.println(c3.getCarattereUnicode());
    }
}