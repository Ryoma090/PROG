package boletin2;

import java.util.Scanner;

public class Eje6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {

            System.out.println("1.- Cuadrado de un numero real");
            System.out.println("2.- Inverso de un numero");
            System.out.println("3.- Raíz cuadrada de un número");
            System.out.println("4.- Operación AND a nivel de bit entre dos números enteros");
            System.out.println("5.- Operación OR a nivel de bit entre dos enteros");
            System.out.println("6.- Salir");
            System.out.println("Seleccione opción:");
            opcion = sc.nextInt();
            switch (opcion) { 
                case 1:
                    System.out.println("Introduce un número entero");
                    int num1 = sc.nextInt();
                    double numCuadrado = num1 * num1;
                    System.out.printf("El cuadrado es: %.2f \n", numCuadrado);
                    System.out.println("----------------------------------------------------------");
                    break;
                case 2:
                    double numInv;
                    do {
                        System.out.println("Introduce un numero para saber su numero inverso");
                        numInv = sc.nextDouble();

                        if (numInv == 0) {
                            System.out.println("el número no puede ser 0");
                        }
                    } while (numInv == 0);

                    double inversion = 1 / numInv;

                    System.out.printf("La inversion es: %.4f \n", inversion);

                    System.out.println("----------------------------------------------------------");
                    break;

                case 3:
                    int num2;

                    do {
                        System.out.println("Introduce un número para saber su raíz");
                        num2 = sc.nextInt();
                        if (num2 < 0) {
                            System.out.println("No se puede calcular la raiz cuadrada de un número negativo");
                        }
                    } while (num2 < 0); {

                    double num2Raiz = Math.sqrt(num2);
                    System.out.printf("La raiz cuandra es: %.3f \n", num2Raiz);

                    System.out.println("----------------------------------------------------------");
                }
                    break;
                case 4:
                    System.out.println("Introduce el primer numero entero: ");
                    int num3 = sc.nextInt();
                    System.out.println("Introduce el segundo número entero: ");
                    int num4 = sc.nextInt();
                    int operacion = num3 & num4;
                    System.out.printf("Resultado: %x \n", operacion);
                    System.out.println("----------------------------------------------------------");
                    break;
                case 5:
                    System.out.println("Introduce el primer numero entero: ");
                    int num5 = sc.nextInt();
                    System.out.println("Introduce el segundo número entero: ");
                    int num6 = sc.nextInt();
                    int operacion2 = num5 | num6;
                    System.out.printf("Resultado: %x \n", operacion2);
                    System.out.println("----------------------------------------------------------");
                    break;
                case 6:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    System.out.println("----------------------------------------------------------");
            }
        } while (opcion != 6);

    }
}
