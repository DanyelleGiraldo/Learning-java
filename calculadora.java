import java.util.Scanner;


public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        int opcion;

        double resultado=0;

        System.out.println("ingrese el primer numero: ");
        num1= scanner.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2= scanner.nextDouble();

        System.out.println("Seleccione su opcion: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        opcion= scanner.nextInt();
        switch (opcion) {
            case 1:
                resultado= num1 + num2;
                break;
        
            case 2:
                resultado= num1 - num2;
                    break;
            case 3: 
                resultado= num1* num2;
                    break;
            case 4: 
                resultado= num1/num2;
                    break;
            default:
            System.out.println("opcion no valida " + opcion);
        }    
        
        System.out.println("el resultado de su operacion fue:" + resultado);
        scanner.close();
    }
}