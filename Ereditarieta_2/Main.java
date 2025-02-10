package Ereditarieta_2;

class Forma {
    public float calcolaArea(float dimensione) {
        return dimensione * dimensione;
    }
}

class Rettangolo extends Forma {
    public float calcolaArea(float lato_min, float lato_max) {
        float area = lato_max * lato_min;
        return area;
    }
}

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo();
        float area = rettangolo.calcolaArea(6, 8);
        System.out.println(area);
    }
}
