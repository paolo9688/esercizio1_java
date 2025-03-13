public class Main {
    public static void main(String[] args) {
        Shape cerchio = ShapeFactory.getForma(ShapeList.CERCHIO);
        cerchio.Draw();
        Shape rettangolo = ShapeFactory.getForma(ShapeList.RETTANGOLO);
        rettangolo.Draw();
        Shape quadrato = ShapeFactory.getForma(ShapeList.QUADRATO);
        quadrato.Draw();
    }
}
