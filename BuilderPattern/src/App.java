/*
Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
Il costruttore accetterà un Builder in input
Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
Creare due oggetti Person e stamparli a video
*/

public class App {
    public static void main(String[] args) {
        // creo un primo oggetto person1 con i campi opzionali address e age:
        Person person1 = new Person.PersonBuilder("Paolo", "Rossi")
            .setAddress("Via Roma 1")
            .setAge(30).build();

        // creo un secondo oggetto person2 con il solo campo opzionale address:
        Person person2 = new Person.PersonBuilder("Mario", "Bianchi")
            .setAddress("Via Milano 2")
            .build();

        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);
    }
}
