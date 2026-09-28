package boletin2;
import java.util.Scanner;

public class Eje7 {
    public static void main(String[] args) {
        int cont = 0;
        int num;
        int suma = 0;
        double media;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce numeros para saber su media ");
            System.out.println("(Cuando no quieras sumar mas numeros introduce el valor: '0': ");

            num = sc.nextInt();
            System.out.println("---------------------------------------------------------------------");

            if (num != 0) {
                suma = suma + num;
                cont++;
            }
        } while (num != 0);
        if (cont > 0) {
            media = suma / cont;
            System.out.println("Has introducido " + cont + " números");
            System.out.println("La media es: " + media);
        }

    }
}
