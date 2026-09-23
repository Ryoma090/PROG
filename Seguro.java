import java.util.Scanner;

/**
 * Seguro
 */
public class Seguro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int precio = 300;
        int edad;
        int aCarnet;

        System.out.println("Por favor dime tu edad: ");
        edad = sc.nextInt();

        System.out.println("Ahora los años que tienes de carnet: ");
        aCarnet = sc.nextInt();

        if (edad < 18) {
            System.out.println("No puedes conducir y por lo tanto no puedes tener seguro");
        } else{
            if (edad >= 18 && edad <= 21){
                precio = 400;
            
        } else if (aCarnet>10){
            precio = 270;

        }
        }
            System.out.println("El precio final es: " + precio);
    }
}