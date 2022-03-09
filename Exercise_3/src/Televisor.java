import java.util.Locale;
import java.util.Scanner;

public class Televisor extends Electrodomestico{
    private double pulgadas;
    private boolean sintonizadorTDT;

    public Televisor(double precio, String color, char consumoEnergetico, double peso, double pulgadas, boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor() {

    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor(){
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        super.crearElectrodomestico();
        System.out.println("Ingrese el numero de pulgadas del televisor: ");
        this.pulgadas = input.nextDouble();
        System.out.println("Posee un sintonizador TDT: 1)Si, 2)No");
        this.sintonizadorTDT = input.nextInt() == 1;
    }

    @Override
    public void obtenerPrecioFinal() {
        super.obtenerPrecioFinal();
        this.precio = (this.pulgadas > 40)? (this.precio*1.3) : this.precio;
        this.precio = (this.sintonizadorTDT)? (this.precio+500) : this.precio;
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                ", pulgadas=" + pulgadas +
                ", sintonizadorTDT=" + sintonizadorTDT +
                '}';
    }
}
