import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
        String op;

        do {
            System.out.println("\t\tMENU");
            System.out.println("-------------------");
            System.out.println("1- Agregar lavadora");
            System.out.println("2- Agregar televisor");
            System.out.println("3- Mostrar precios finales");
            System.out.println("4- Mostrar precio final total");
            System.out.println("5- Mostrar electrodomesticos");
            System.out.println("6- Salir");
            System.out.println("-------------------");
            System.out.print("\nOption: ");
            op = input.next();

            switch (op) {
                case "1":
                    Lavadora l = new Lavadora();
                    l.crearLavadora();
                    l.obtenerPrecioFinal();
                    electrodomesticos.add(l);
                    break;
                case "2":
                    Televisor t = new Televisor();
                    t.crearTelevisor();
                    t.obtenerPrecioFinal();
                    electrodomesticos.add(t);
                    break;
                case "3":
                    mostrarPrecios(electrodomesticos);
                    break;
                case "4":
                    mostrarPrecioTotal(electrodomesticos);
                    break;
                case "5":
                    mostrarElectrodomesticos(electrodomesticos);
                    break;
                case "6":
                    System.out.println("Saliendo del menu. Bye!");
                    break;
                default:
                    System.out.println("Enter a correct option");
                    break;
            }

        } while (!op.equalsIgnoreCase("6"));
    }

    public static void mostrarPrecios(ArrayList<Electrodomestico> list) {
        int sumT = 0, sumL = 0;
        if (!list.isEmpty()) {
            for (Electrodomestico e : list) {
                if(e instanceof Lavadora){
                    sumL += e.getPrecio();
                }else{
                    sumT += e.getPrecio();
                }
            }
            System.out.printf("Precio Total Televisores: $%d, Precio Total Lavadoras: $%d\n", sumT,sumL);
        } else {
            System.out.println("No hay electrodomesticos cargados");
        }
    }

    public static void mostrarPrecioTotal(ArrayList<Electrodomestico> list){
        int sumT = 0;

        if(!list.isEmpty()){
            for (Electrodomestico e : list) {
                sumT += e.getPrecio();
            }
            System.out.printf("Precio Total: $%d\n",sumT);
        }else{
            System.out.println("No hay electrodomesticos cargados");
        }
    }

    public static void mostrarElectrodomesticos(ArrayList<Electrodomestico> list){
        if (!list.isEmpty()){
            for (Electrodomestico e : list){
                if (e instanceof Lavadora){
                    System.out.println(e);
                }else{
                    System.out.println(e);
                }
            }
        }else{
            System.out.println("No hay electrodomesticos cargados");
        }
    }
}
