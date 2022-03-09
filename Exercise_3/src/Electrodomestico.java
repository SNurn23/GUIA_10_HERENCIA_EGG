import java.util.Locale;
import java.util.Scanner;

public abstract class Electrodomestico {
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Electrodomestico() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra){
        letra = Character.toUpperCase(letra);
        int l = letra;
        this.consumoEnergetico = ((l >= 65 && l <= 70))? letra : 'F';
    }

    public void comprobarColor(String color){
        if(color.equalsIgnoreCase("Rojo") || color.equalsIgnoreCase("Negro") || color.equalsIgnoreCase("Blanco") || color.equalsIgnoreCase("Azul") || color.equalsIgnoreCase("Gris")){
            this.color = color;
        }else{
            this.color = "Blanco";
        }
    }

    public void crearElectrodomestico(){
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el color del electrodomestico: ");
        String color = input.next();
        comprobarColor(color);
        System.out.println("Ingrese el consumo energetico (una letra): ");
        char letra = input.next().charAt(0);
        comprobarConsumoEnergetico(letra);
        System.out.println("Ingrese el peso: ");
        this.peso = input.nextDouble();
        this.precio = 1000;
    }

    public void obtenerPrecioFinal(){
        switch(this.consumoEnergetico){
            case 'A': this.precio += 1000;
                break;
            case 'B': this.precio += 800;
                break;
            case 'C': this.precio += 600;
                break;
            case 'D': this.precio += 500;
                break;
            case 'E': this.precio += 300;
                break;
            case 'F': this.precio += 100;
                break;
        }

        if(this.peso >= 1 && this.peso <= 19){
            this.precio += 100;
        }else if(this.peso >= 20 && this.peso <= 49){
            this.precio += 500;
        }else if(this.peso >= 50 && this.peso <= 79){
            this.precio += 800;
        }else if(this.peso >= 80 ){
            this.precio += 1000;
        }
    }

}
