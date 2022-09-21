import java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        double radio, area;
        System.out.println("AREA DE UN CIRCULO");
        System.out.println("Ingrese el radio del circulo");
        radio= in.nextDouble();
        area=(3.14159265)*(radio*radio);
        
        System.out.println("El area del circulo es: "+area);


    }
}
