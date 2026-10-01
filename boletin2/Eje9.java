package boletin2;
import java.util.Scanner;

@SuppressWarnings ({"resource"})
public class Eje9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFinish;
        int cont = 0;
        int num;
        int mayor = Integer.MIN_VALUE; //TODO -2147483648TODO revisar referencia
        System.out.println("Cuantos números deseas introducir?: ");
        numFinish = sc.nextInt();
        do {
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
            cont++;
            if(num > mayor){
                mayor = num;
            }
        
            
        } while (cont < numFinish);
            System.out.println("El numero máximo es: " + mayor);
        
        
    }

}
