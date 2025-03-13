public class Main {
    public static void main(String[] args) {
        // Creo un oggetto cerchio e stampo la sua forma:
        Shape cerchio = ShapeFactory.getForma(ShapeList.CERCHIO);
        cerchio.Draw();
        // Creo un oggetto rettangolo e stampo la sua forma:
        Shape rettangolo = ShapeFactory.getForma(ShapeList.RETTANGOLO);
        rettangolo.Draw();
        // Creo un oggetto quadrato e stampo la sua forma:
        Shape quadrato = ShapeFactory.getForma(ShapeList.QUADRATO);
        quadrato.Draw();
    }
}
