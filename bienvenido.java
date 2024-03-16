import java.util.Scanner;

public class bienvenido{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String NombredelUsuario;

        System.out.println("ingrese su nombre usuario:");
        NombredelUsuario= entrada.nextLine();

        System.out.println("Bienvenido "+ NombredelUsuario);
        entrada.close();
    }
}