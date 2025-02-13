package Enum;

enum TipoForma {
    TRIANGOLO,
    RETTANGOLO
}

class Forma {
    public double calcolaArea() {
        return 0;
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
    public double calcolaArea() {
        return base * altezza * 0.5;
    }

    public String toString() {
        return "L'area del triangolo è pari a: " + calcolaArea();
    }

    public TipoForma getForma() {
        return TipoForma.TRIANGOLO;
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
    public double calcolaArea() {
        return base * altezza;
    }

    public String toString() {
        return "L'area del rettangolo è pari a: " + calcolaArea();
    }

    public TipoForma getForma() {
        return TipoForma.RETTANGOLO;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creo nuove istanze di triangolo e rettangolo:
        Triangolo triangolo = new Triangolo(4, 9);
        Rettangolo rettangolo = new Rettangolo(5, 2.5);

        // Stampo le aree di triangolo e rettangolo:
        System.out.println(triangolo.toString());
        System.out.println(rettangolo.toString());

        // Stampo i tipi di triangolo e rettangolo:
        System.out.println("\nIl triangolo ha la forma: " + triangolo.getForma());
        System.out.println("Il rettangolo ha la forma: " + rettangolo.getForma());
    }
}