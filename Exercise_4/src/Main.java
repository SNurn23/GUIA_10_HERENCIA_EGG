public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(2);
        c.calcularArea();
        c.calcularPerimetro();

        Rectangulo r = new Rectangulo(12,18);
        r.calcularArea();
        r.calcularPerimetro();
    }
}
