public class Main {
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.aumentarPuertas();
        miCoche.aumentarPuertas();
        miCoche.aumentarPuertas();
        System.out.println("Cantidad de puertas: "+miCoche.numeroPuertas);
    }
}