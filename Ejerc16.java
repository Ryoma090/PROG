import java.util.Scanner;

public class Ejerc16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int asteriscos;

        System.out.println("a) Cuantos asteriscos quieres?");
        asteriscos = sc.nextInt();
        for (int i = 0; i < asteriscos; i++) {
            System.out.print("*");
            
        }
        System.out.println();
      
            
            int diagonal;
            System.out.println("b) Para que lado quieres la diagonal de asteriscos? (1.-Derecha 2.-Izquierda) ");
            diagonal = sc.nextInt();
            if(diagonal == 1){
            
                for (int i = 0; i < asteriscos; i++) {
                        System.out.println(" ");
                    }
                    System.out.println("*");
                    }
           
        

            else {
            for (int i = 0; i < asteriscos;  i--) {
            System.out.println(" ");

            }
            System.out.println("*");
        }

    }
}

