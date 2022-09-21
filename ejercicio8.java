import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int b=0, h, A=0, P=0;
        
        System.out.println("AREA DE UN ROMBOIDE");
        System.out.println("Ingrese el valor de la base");
        b=in.nextInt();
        System.out.println("Ingrese el valor de la altura");
        h=in.nextInt();
        A=b*h;
        
        System.out.println("El area es: "+A);
        
        System.out.println("PERIMETRO DE UN ROMBOIDE");
        System.out.println("Ingrese el valor de la base");
        b=in.nextInt();
        System.out.println("Ingrese el valor de la altura");
        b=in.nextInt();
        P=(2*b)+(2*h);
        System.out.println("El perimetro es: "+P);
        
        System.out.println("TRABAJO HECHO POR ARANA FRANZ");

    }
}
