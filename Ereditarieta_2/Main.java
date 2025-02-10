package Ereditarieta_2;

class Forma {
    public void calcolaArea() {
        System.out.println("Area della forma");
    }
}

class Rettangolo extends Forma {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        double area = base * altezza;
        System.out.println("Area del rettangolo: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Forma formaGenerica = new Forma();
        formaGenerica.calcolaArea();
        Rettangolo rettangolo = new Rettangolo(5, 10);
        rettangolo.calcolaArea();
    }
}
