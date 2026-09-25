import java.util.Scanner;

public class eje5 {
    public static void main(String[] args) {
        int num;
        double farenheit;
        double kelvin;

        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Conversor de temperaturas\n Opcion 1:Convertir a Farenheit \n Opcion 2: Convertir a Kelvin \nOpcion 3 : salir");
        num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Intruce los grados en Celsius: ");
                double celsius = sc.nextDouble();
                farenheit = 1.8 * celsius + 3;
                System.out.println("Hacen " + farenheit + "º Farenheit");
                break;

            case 2:
                System.out.println("Intruce los grados en Celsius: ");
                double celsius2 = sc.nextDouble();
                kelvin = celsius2 + 273.15;
                System.out.println("Hacen " + kelvin  + "º Farenheit");
                break;
            default:

                break;
        }
    }

}
