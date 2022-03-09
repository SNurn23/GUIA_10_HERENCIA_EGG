public class Perro extends Animal{

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Perro() {
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getAlimento() {
        return super.getAlimento();
    }

    @Override
    public void setAlimento(String alimento) {
        super.setAlimento(alimento);
    }

    @Override
    public int getEdad() {
        return super.getEdad();
    }

    @Override
    public void setEdad(int edad) {
        super.setEdad(edad);
    }

    @Override
    public String getRaza() {
        return super.getRaza();
    }

    @Override
    public void setRaza(String raza) {
        super.setRaza(raza);
    }

    @Override
    public void alimentarse() {
        System.out.printf("El perro %s de la raza %s y de edad %d se alimenta de %s\n",nombre,raza,edad,alimento);
    }
}
