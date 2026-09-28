package boletin2;
import java.util.Scanner;

public class Eje5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        
        do {
            // println’s con opciones de menú
            System.out.println("1.- Celsius a Farenheit");
            System.out.println("2.- Celsius a Kelvin");
            System.out.println("3.- Salir");
            System.out.println("Seleccione opción:");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1: // Opción 1
                    System.out.println("Intruce los grados en Celsius: ");
                    double celsius = sc.nextDouble();
                    double farenheit = 1.8 * celsius + 32;
                    System.out.printf("Hacen: %.2f º Farenheit \n", farenheit );
                    System.out.println("---------------------------------------------");
                    break;
                case 2: // Opción 2
                    System.out.println("Intruce los grados en Celsius: ");
                    double celsius2 = sc.nextDouble();
                    double kelvin = celsius2 + 273.15;
                    System.out.printf("Hacen: %.2f K\n ", kelvin);
                    System.out.println("---------------------------------------------");
                    break;
                case 3:
                    System.out.println("Hasta Pronto!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    System.out.println("---------------------------------------------");
                    
            }
        } while (opcion != 3);

    }

}
