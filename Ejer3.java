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
    
}
