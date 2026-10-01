package boletin2;

import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int repetir;

        do {
            System.out.println("Introduce 3 números: ");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double num3 = sc.nextDouble();

            if (num1 >= num2 && num1 >= num3) {
                System.out.println("El primer número: " + num1 + " es el más grande");
            } else if (num2 > num3) {
                System.out.println("El segundo número: " + num2 + " es el más grande");
            } else {
                System.out.println("El tercer número: " + num3 + " es el más grande");
            }

            System.out.println("¿Quieres volver a repetir? 1 = Sí / 0 = No");
            repetir = sc.nextInt();

        } while (repetir == 1);

        System.out.println("Hasta la próxima");

        sc.close();
    }
}