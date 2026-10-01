import java.util.Scanner;

public class Eje14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int num1 = 0;
        int cont = 5;

        do{
            System.out.println("Jugador 1.- Introduce un número del 1 al 100");
            num = sc.nextInt();
            System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
            do{
                if(cont > 0){
                System.out.println("Jugador 2._ (Tienes " + cont + " intentos) Adivina que número que es: ");
                num1= sc.nextInt();
                if(num1 > num){
                    System.out.println("El número es menor");
                }else{
                    System.out.println("El numero es mayor");
                }
                }else{
                    System.out.println("Perdiste");
                    break;
                }
                cont--;
            }while(num1 != num && num1 > 0);
            
            
        }while(num > 1 || num < 100);
        System.out.println("El numero esta fuera del rango");
    }
    
}//Quieres jugar otra partida?
