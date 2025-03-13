public class ShapeFactory {
    public static Shape getForma(ShapeList tipo) {
        Shape forma = switch(tipo) {
            case CERCHIO -> new Cerchio();
            case RETTANGOLO -> new Rettangolo();
            case QUADRATO -> new Quadrato();
            default -> null;
        };
        return forma;
    }
}
