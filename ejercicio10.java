import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] arg) {
        float acum = 1;
        float notas = 0;
        Scanner r = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de notas para promediar");
        float cn = r.nextFloat();
        
        while (notas <= cn){
            System.out.println("Ingrese la nota a promediar: "+acum);
            float n=r.nextFloat();
            notas = n;
            acum++;
        }
        
        float promedios = notas/cn;
        
        System.out.println("El promedio es: "+promedios);


    }
}
