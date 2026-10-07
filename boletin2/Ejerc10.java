package boletin2;
import java.util.Scanner;
public class Ejerc10 {
public static void main(String[] args) {
    int num1;
    int num2;
    int var1 = 0;
    int var2 = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce 2 numeros"); 
    num1 = sc.nextInt(); //6
    num2 = sc.nextInt(); //2

    // var2= num2;
    
    var1 = num1;
    num1=  num2;
    num2=var1;
    //num2 = var1;



    // System.out.println("Intercambia las variables");
    // num1 ->2
    // num2 ->6

    System.out.println("1: "+ num1 + " \n2: "+ num2);

}    
}
