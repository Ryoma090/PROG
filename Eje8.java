import java.util.Scanner;

public class Eje8 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Introduce 3 números: ");
    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();
    double num3 = sc.nextDouble();

    if( num1 > num2 && num1 > num3);{
        System.out.println("El numero: " + num1 + " es el mas grande");
    }
    if( num2 > num1 && num2 > num3);{
        System.out.println("El numero: " + num2 + " es el mas grande");
    }else {
        System.out.println("El numero: " + num3 + " es el mas grande");
    }
    
}
}
