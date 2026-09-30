package boletin2;
import java.util.Scanner;

public class eje3 {
    public static void main(String[] args) {
        int num1;
        int cont = 1;
        int suma;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime el primer numero: ");
        num1 = sc.nextInt();

        if (num1 > 0) {
            while (num1 >= cont) {
                System.out.println("contador " + cont);
                cont++;
                suma = num1 + cont;// TODO Revisar
                System.out.println("acumulador : " + suma);
            }
        }
    }
}
