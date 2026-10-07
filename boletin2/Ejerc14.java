package boletin2;

import java.util.Scanner;

public class Ejerc14 {
    public static void salto(int n) {
                        
        
        for(int i = 0; i< n; i++){
            System.out.println("");

        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int num1;
        int cont;

        int repetir;

        do {

            do {
                System.out.println("Jugador 1.- Introduce un número del 1 al 100");
                num = sc.nextInt();

                if (num < 1 || num > 100) {
                    System.out.println("Número incorrecto, debe estar entre 1 y 100");
                }

            } while (num < 1 || num > 100);

            salto(50);

            cont = 5;
            num1 = 0;

            do {

                do {
                    System.out.println("Jugador 2.- (Te quedan " + cont + " intentos)");
                    System.out.println("Adivina el número:");
                    num1 = sc.nextInt();

                    if (num1 < 1 || num1 > 100) {
                        System.out.println("Número incorrecto, debe estar entre 1 y 100");
                    }

                } while (num1 < 1 || num1 > 100);

                if (num1 == num) {
                    System.out.println("Has acertado");
                } else if (num1 > num) {
                    System.out.println("El numero es menor");
                    cont--;
                } else {
                    System.out.println("El numero es mayor");
                    cont--;
                }

            } while (num1 != num && cont > 0);

            if (num1 != num) {
                System.out.println("Perdiste, el numero era: " + num);
            }

            System.out.println("Quieres jugar otra partida? 1 = si / 0 = no");
            repetir = sc.nextInt();

        } while (repetir == 1);

        System.out.println("Fin");

        
    }
}
