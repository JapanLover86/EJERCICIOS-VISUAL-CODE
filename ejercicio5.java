import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int l=0, A=0, P=0;
        
        System.out.println("AREA DE UN CUADRADO");
        System.out.println("Ingrese el valor del lado");
        l=in.nextInt();
        A=l*l;
        
        System.out.println("El area es: "+A);
        
        System.out.println("PERIMETRO DE UN CUADRADO");
        System.out.println("Ingrese el valor del lado");
        l=in.nextInt();
        P=4*l;
        System.out.println("El perimetro es: "+P);
        
        System.out.println("TRABAJO HECHO POR ARANA FRANZ");
    }
}