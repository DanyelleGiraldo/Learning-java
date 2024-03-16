import java.util.Scanner;

public class Radiocirculo{
    public static void main(String[] args) {
        Scanner radioCirculo = new Scanner(System.in);

        double perimetro, area;

        int cirucloradio;

        System.out.println("Ingrese el radio de su circulo");
        cirucloradio= radioCirculo.nextInt();

        area = Math.PI * Math.pow(cirucloradio,2);
        perimetro= (Math.PI*2)* cirucloradio;
        
        System.out.println("El area del circulo es: "+ area);
        System.out.println("El Perimetro del circulo es: "+perimetro);

        radioCirculo.close();

    }
}