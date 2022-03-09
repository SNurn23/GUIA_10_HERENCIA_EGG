import java.util.Locale;
import java.util.Scanner;

public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora(double precio, String color, char consumoEnergetico, double peso, int carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora() {

    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora(){
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese la carga de la lavadora: ");
        this.carga = input.nextInt();
        super.crearElectrodomestico();
    }

    @Override
    public void obtenerPrecioFinal() {
        super.obtenerPrecioFinal();
        this.precio = (this.carga > 30)? (this.precio+500 ) : this.precio;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                ", carga=" + carga +
                '}';
    }
}
