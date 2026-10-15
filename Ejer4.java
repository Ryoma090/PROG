import java.util.Scanner;
public class Ejer4 {
    public static int multiplo(int año) {
        
        if(año / 400){

        }
        if(año % 400== 1 && año % 100 % == 0){


            System.out.println("False");
        }
        if( año % 100== 1 && año % 4 == 0 ){
            System.out.println("El año es bisiesto ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Introduce el año: ");
        int año = sc.nextInt();
        multiplo(año);
    }while (año == 0);
    System.out.println("Telmino");
    }
}
