public class Mascotas {
    //Class Father
    int numPatas;
    String raza;
    String group;
    //Constructor
    public Mascotas(){
    }
    // Constructor
    public Mascotas(int numPatas, String raza, String group){
        this.numPatas = numPatas;
        this.raza = raza;
        this.group = group;
    }
    // getters
    public int getNumPatas() {
        return numPatas;
    }

    public String getRaza() {
        return raza;
    }

    public String getGroup() {
        return group;
    }
    // setters
    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    // Method personalizado
    public void mostrarInformacion(){
        System.out.println("--------------------------------");
        System.out.println("  [FICHA TECNICA OF THE PET ]  ");
        System.out.println("Raza: " + raza);
        System.out.println("Numero de patas: " + numPatas);
        System.out.println("Grupo: " + group);
        System.out.println("--------------------------------");
    }
}
