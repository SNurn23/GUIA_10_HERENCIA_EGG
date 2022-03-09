public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro("Stich", "Carnivoro", 15,"Doberman");
        perro.alimentarse();
        Perro perrol = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perrol.alimentarse();
        Animal gato = new Gato ("Pelusa", "Galletas", 15, "Siames");
        gato.alimentarse();
        Animal caballo = new Caballo("Spark","Pasto",25,"Fino");
        caballo.alimentarse();
    }
}
