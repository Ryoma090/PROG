package boletin2;
import java.util.Scanner;
public class Ejer10 {
public static void main(String[] args) {
    int num1;
    int num2;
    int var1;
    int var2;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce 2 numeros");//TODO revisar
    num1 = sc.nextInt(); //6
    num2 = sc.nextInt(); //2


    var1 = num2;
    var2 = num1;
    // System.out.println("Intercambia las variables");
    // num1 ->2
    // num2 ->6

    System.out.println("1: "+ var1 + " 2: "+ var2 + " 3: "+ num1 + " 4: " + num2);

}    
}
