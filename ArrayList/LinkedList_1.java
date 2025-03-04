/*
Creare una classe Fruit che accenti nel costruttore il parametro name (String)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo
Stampare la collezione aggiornata
*/

package ArrayList;

import java.util.LinkedList;

class Fruit {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit {" +
                "name = '" + name + '\'' +
                '}';
    }
}

public class LinkedList_1 {
    public static void main(String[] args) {
        // creazione di una LinkedList di Fruit:
        LinkedList<Fruit> fruits = new LinkedList<>();
        fruits.add(new Fruit("Mela"));
        fruits.add(new Fruit("Banana"));
        fruits.add(new Fruit("Arancia"));
        fruits.add(new Fruit("Kiwi"));
        fruits.add(new Fruit("Pera"));

        // stampa degli elementi della lista:
        System.out.println("Lista di frutta:");
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }

        // aggiunta di un elemento in testa alla lista:
        fruits.addFirst(new Fruit("Pesca"));

        // aggiunta un elemento in coda alla lista:
        fruits.addLast(new Fruit("Uva"));

        // stampa della lista aggiornata:
        System.out.println("\nLista di frutta aggiornata:");
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
