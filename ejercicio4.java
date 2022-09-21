import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int b=0, h=0, l=0, A=0, P=0;
        
        System.out.println("AREA DE UN TRIANGULO");
        System.out.println("Ingrese el valor de la altura");
        h=in.nextInt();
        System.out.println("Ingrese el valor de la base");
        b=in.nextInt();
        A=b*h;
        
        System.out.println("El area es: "+A);
        
        System.out.println("PERIMETRO DE UN TRIANGULO");
        System.out.println("Ingrese el valor del lado");
        l=in.nextInt();
        P=l+l+l;
        System.out.println("El perimetro es: "+P);
    }
}
