package Classi_Astratte;

abstract class Forma {
    protected abstract void calcolaArea();
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

class Triangolo extends Forma {
    private double base;
    private double altezza;

    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        double area = base * altezza * 0.5;
        System.out.println("Area del triangolo: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Forma rettangolo = new Rettangolo(5, 10);
        rettangolo.calcolaArea();
        Forma triangolo = new Triangolo(4, 9);
        triangolo.calcolaArea();
    }
}