public class Circulo implements calculosFormas{
  private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.printf("Area del circulo: %.2f\n",(PI*Math.pow(radio,2)));
    }

    @Override
    public void calcularPerimetro() {
        System.out.printf("Perimetro del circulo: %.2f\n",(2*PI*radio));
    }
}
