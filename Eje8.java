import java.util.Scanner;

public class Eje8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String repetir;
        do {
            System.out.println("Introduce 3 números: ");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double num3 = sc.nextDouble();

            if (num1 >= num2 && num1 >= num3) {
                System.out.println("El primer número: " + num1 + " es el mas grande");
            } else if (num2 > num3) {
                System.out.println("El segundo número: " + num2 + " es el mas grande");
            } else {
                System.out.println("El tercer número: " + num3 + " es el mas grande");
            }
            System.out.println("volver del bucle (si/no)");
            repetir = sc.next();
        } while (repetir.equalsIgnoreCase("si"));
        {
            System.out.println("Hasta la proxima");
        }
        sc.close();
    }
}
