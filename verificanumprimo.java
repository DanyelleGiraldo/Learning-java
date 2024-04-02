import java.util.Scanner;

public class verificanumprimo {
    public static void main(String[] args) {
        Scanner numero= new Scanner(System.in);

        int numeroingresado;

        System.out.println("Ingrese su numero para verificar si es primo o no: ");
        numeroingresado= numero.nextInt();

        boolean esprimo= true;

        if (numeroingresado <= 1) {
            esprimo= false;
        } else{
            for(int i=2; i<= Math.sqrt(numeroingresado); i++ ){
                if(numeroingresado % i == 0){
                    esprimo= false;
                    break;
                }
            }
        }
        
        if(esprimo){
            System.out.println(numeroingresado+ " es un numero primo.");
        }else{
            System.out.println(numeroingresado + "no es primo.");
        }
        numero.close();
    }
}
