package Interfacce;

interface IForma {
    public double calcolaArea();
    public String toString();
    public void printArea();
}

class Rettangolo implements IForma {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        double area = base * altezza;
        return area;
    }

    @Override
    public String toString() {
        return "L'area del rettangolo equivale a: " + calcolaArea();
    }

    @Override
    public void printArea() {
        System.out.println(toString());
    }
}

class Triangolo implements IForma {
    private double base;
    private double altezza;

    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        double area = base * altezza * 0.5;
        return area;
    }

    @Override
    public String toString() {
        return "L'area del triangolo equivale a: " + calcolaArea();
    }

    @Override
    public void printArea() {
        System.out.println(toString());
    }
}

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 10);
        Triangolo triangolo = new Triangolo(4, 9);
        rettangolo.printArea();
        triangolo.printArea();
    }
}