package Ereditarieta_1;

class Animale {
    public void faiIlVerso() {
        System.out.println("Il verso dell'animale");
    }
}

class Gatto extends Animale {
    public void faiIlVerso() {
        System.out.println("Miao");
    }
}

class Main {
    public static void main(String[] args) {
        Animale animale = new Animale();
        Gatto gatto = new Gatto();
        animale.faiIlVerso();
        gatto.faiIlVerso();
    }
}
  