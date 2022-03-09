public class Rectangulo implements CalculosFormas{
    private double altura;
    private double base;

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public Rectangulo() {
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public void calcularArea() {
        System.out.printf("Area del Rectangulo: %.2f\n",(base * altura));
    }

    @Override
    public void calcularPerimetro() {
        System.out.printf("Perimetro del Rectangulo: %.2f\n",((base + altura)*2));
    }
}
