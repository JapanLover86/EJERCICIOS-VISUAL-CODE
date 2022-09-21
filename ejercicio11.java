import java.util.Scanner;
public class ejercicio11 {
    public static void main(String[] arg) {
        int n=0;
        int resultado;
        
        Scanner numeros = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int numero1 = numeros.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2 = numeros.nextInt();
        System.out.println("Ingrese el tercer numero");
        int numero3 = numeros.nextInt();
        System.out.println("Ingrese el cuarto numero");
        int numero4 = numeros.nextInt();
        System.out.println("Ingrese el quinto numero");
        int numero5 = numeros.nextInt();
        
        resultado = numero1*numero2*numero3*numero4*numero5;
        
        System.out.println("El resultado de la multiplicacion es: "+resultado);

    }
}