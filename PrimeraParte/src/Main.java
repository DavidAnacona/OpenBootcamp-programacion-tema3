public class Main {
    public static void main(String[] args) {
        suma(15,15,15);
        System.out.println("Finaliza primera parte");
    }
    public static void suma(int num1, int num2, int num3){
        int suma;
        suma = num1 + num2 + num3;
        System.out.println("La suma de los tres numeros es: "+suma);
    }
}