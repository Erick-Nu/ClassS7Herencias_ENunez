public class Conejo extends Mascotas{
    double peso;
    double altura;
    String name;

    public Conejo() {
    }
    public Conejo(int numPatas, String raza, String group, double peso, double altura, String name) {
        super(numPatas, raza, group);
        this.peso = peso;
        this.altura = altura;
        this.name = name;
    }
    // Individual class dog
    public Conejo(double peso, double altura, String name) {
        this.peso = peso;
        this.altura = altura;
        this.name = name;
    }
    // Individual class Pets
    public Conejo(int numPatas, String raza, String group){
        super(numPatas, raza, group);
    }
    // getters

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getName() {
        return name;
    }

    // setters

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setName(String name) {
        this.name = name;
    }
    // Metodo Personalizado
    public void fichaMyrabbit(){
        System.out.println("--------------------------------");
        System.out.println("  [FICHA TECNICA OF MY RABBIT ]  ");
        System.out.println("Nombre: " + name);
        System.out.println("Peso: " + peso + "kg");
        System.out.println("Altura: " + altura + "cm");
        System.out.println("--------------------------------");
    }
    public void llorar(){
        System.out.println(" YOUR RABBIT CRIES ");
    }
}
