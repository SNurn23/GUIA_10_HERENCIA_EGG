public class Main {
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        lavadora.obtenerPrecioFinal();
        System.out.println(lavadora);

        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
        televisor.obtenerPrecioFinal();
        System.out.println(televisor);
    }
}
