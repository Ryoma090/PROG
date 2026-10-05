import java.util.Scanner;

public class Ejerc15 {
    public static void main(String[] args) {
        int N;
        int NFor;
        int NDo;
        int factorialFor;
        int factorialDo;
        int NWhile;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para saber su factorial: ");
        N = sc.nextInt();
        
        factorialFor = 1;
        for (NFor = N ; NFor > 0; NFor--){
       
        factorialFor = factorialFor * NFor;
        
       
        System.out.println(factorialFor);
        }
        System.out.println(factorialFor);
        NDo = N ;
            factorialDo = 1 ;
        do{
           
            factorialDo = factorialDo * NDo;

            NDo --;
            



        }while(NDo > 0);
        System.out.println(factorialDo);

        NWhile = N;
        int factorialWhile = 1 ;
        while(NWhile > 0){
        factorialWhile = factorialWhile * NWhile;
        NWhile --;
        }
        System.out.println(factorialWhile);



    }
}
