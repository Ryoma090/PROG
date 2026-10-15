import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
public class Ejer3 {

    /**
     * pedir numero positivo
     * 
     * @param pedir , num
     * return numero pos
     */
    public static String pideNumero(String pedir, int num) {
        Scanner sc= new Scanner(System.in);
        
        do { 
        System.out.println("Introduce un numero positivo");
        num = sc.nextInt();
        }while(num <= 0);
        System.out.println(num);

        return "El número es: " + num;
    }
    public static int superficieCilindro(int radio, int altura) {
        

        double superficie = 2 * Math.PI * radio * altura;
        return (int) superficie;
    }
    public static String mostrarDato(String area, int num2) {
        System.out.printf("%.3f", num2 );
    
    }
    public static void main(String[] args) {
        System.out.println("Introduce el radio del cilindro: " + pideNumero("positivo", 6 ));


    }
    
}
