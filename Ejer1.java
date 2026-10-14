import java.util.Scanner;

public class Ejer1 {

    /**
     * Espacios en blanco
     * 
     * @param n numero de espacios en blanco
     *          return espacios en blanco
     */
    public static void blanco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(" ");
        }
    }

    /**
     * indica si es par
     * 
     * @param num
     * @return positivo
     */
    public static String par(int num) {
        if (num % 2 == 0) {
            return("True");
        } else {
           return("False");
        }

    }

    /**
     * indica si es positivo o negativo
     * 
     * @param num1
     * @return positivo 0 neg
     */
    public static String pos(int num1) {
        return(num1 >= 0 ? "P" : "N");
       

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Como te llamas: ");
        String nombre = sc.next();

        blanco(10);
        System.out.println("Dime un numero entero: ");
        int numEntero = sc.nextInt();
        
        System.out.println("Hola " + nombre + " tu numero " + numEntero + " es " +  par(numEntero) + " y " + pos(numEntero));
    }

}
