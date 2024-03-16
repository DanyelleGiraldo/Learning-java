import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int opcion;
        double temperatura, resultado;

        System.out.println("¿Qué temperatura desea ingresar?");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese los grados expresados en Celsius: ");
                temperatura = input.nextDouble();
                resultado = (temperatura * 9 / 5) + 32;
                System.out.println("El resultado es: " + resultado + " Fahrenheit");
                break;
        
            case 2:
                System.out.println("Ingrese los grados expresados en Fahrenheit: ");
                temperatura = input.nextDouble();
                resultado = (temperatura - 32) * 5 / 9;
                System.out.println("El resultado es: " + resultado + " Celsius");
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }
        input.close();
    }
}
