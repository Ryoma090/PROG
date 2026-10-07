import java.util.Scanner;

public class Ejer1 {

    /** 
     * Espacios en blanco
     * @param n numero de espacios en blanco
     * return espacios en blanco
     */
    public static void n() {

        System.out.println(" ");
    }

    /**
     * indica si es positivo o negativo
     * @param num
     * @return positivo o negativo
     */
    public static void par(int num) {
        if (num % 2 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
public static int positivo(int a) {
    
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            n();

        }
        System.out.println("Introduce un numero para saber si es par");
        int num = sc.nextInt();
        par(num);
    }

}
