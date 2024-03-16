import java.util.Scanner;

public class empresa {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double repositor, cajero, supervisor;
        int opcion;
        
        repositor= 15580 + (15580*0.10);
        cajero= 25630.89;
        supervisor= 35560.20- (35560.20*0.11);

        System.out.println("Que sueldo de empleado quiere ver?");
        System.out.println("1. Repositor");
        System.out.println("2. Cajero");
        System.out.println("3. Supervisor");    
        opcion= input.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("el sueldo del repositor es: "+ repositor);
                break;
            case 2:
                System.out.println("el sueldo del cajero es: "+cajero);
                    break;
            case 3:
                System.out.println("el sueldo del supervisor es: "+supervisor);
                    break;
            
        }
        input.close();
    }
}