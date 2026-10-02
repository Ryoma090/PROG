package boletin2;

import java.util.Scanner;

public class Ejerc13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        int suma4 = 0;
        System.out.println("Introduce un número");
        N = sc.nextInt();
        for (int num1 = 0; num1 < N; num1++) {
            if (num1 % 2 == 0) {
                suma1 = num1 + suma1;

            }

        }
        System.out.println("a) suma de números pares entre 0 y " + N + ":  " + suma1);
        System.out.println(
                "-----------------------------------------------------------------------------------------------");
        for (int num2 = 0; num2 < N; num2++) {
            if (num2 % 2 != 0) {
                suma2 = num2 + suma2;

            }

        }
        System.out.println("b) suma de números impares entre 0 y " + N + ":  " + suma2);
        System.out.println(
                "-----------------------------------------------------------------------------------------------");
        for (int num3 = 0; num3 < N; num3++) {
            if (num3 % 2 == 0) {
                suma3 = num3 + suma3;

            } else {
                suma4 = num3 + suma4;

            }

        }
        System.out.println("Suma de números pares por una parte 0 y " + N + ":  " + suma3);
        System.out.println("Suma de números impares por otra parte 0 y " + N + ":  " + suma4);

    }
}