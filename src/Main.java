import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // FRIST CLASS
        Perro perroOne = new Perro();
        // Classes Methods Mascotas and Perro
        perroOne.fichaMydog();
        perroOne.mostrarInformacion();
        perroOne.ladrar();
        // SECOND CLASS
        Gato gatoOne = new Gato(4,"Esfinge","Felino" );
        // Classes Methods Mascotas and Gato
        gatoOne.mostrarInformacion();
        gatoOne.fichaMycat();
        gatoOne.aullar();
        // THIRD CLASS
        Loro loroOne = new Loro(1,63,"Fenix");
        loroOne.fichaMyparrot();
        loroOne.mostrarInformacion();
        loroOne.silvar();
        // FOURTH CLASS
        Conejo conejoOne = new Conejo(4,"Conejo Leon","Leporidos",1.5,33,"Algodon de Dulce");
        conejoOne.mostrarInformacion();
        conejoOne.fichaMyrabbit();
        conejoOne.llorar();
        // FIFTH CLASS
        Tortuga tortugaOne = new Tortuga();
        System.out.println(" CREATE ONE CARD FOR YOUR PET ");
        System.out.println("[NAME]: ");
        String name = teclado.nextLine();
        tortugaOne.setName(name);
        System.out.println("[HEIGHT]: ");
        double height = teclado.nextInt();
        tortugaOne.setAltura(height);
        System.out.println("[WEIGHT]: ");
        double weight = teclado.nextDouble();
        tortugaOne.setPeso(weight);
        // Limpiar la variable teclado
        teclado.nextLine();
        System.out.println("[GRUPO AL QUE PERTENECE]: ");
        String grup = teclado.nextLine();
        tortugaOne.setGroup(grup);
        System.out.println("[NUMERO DE PATAS]: ");
        int numPatas = teclado.nextInt();
        tortugaOne.setNumPatas(numPatas);
        teclado.nextLine();
        System.out.println("[RAZA]: ");
        String raza = teclado.nextLine();
        tortugaOne.setRaza(raza);
        tortugaOne.fichaCompleta();
        tortugaOne.grunir();
    }
}