import java.util.Scanner;

public class Ejerc15 {
    public static void main(String[] args) {
        int N;
        int N2;
        int factorial;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para saber su factorial: ");
        N = sc.nextInt();
        for(N2 = N; N2 < 0; N2--);
        factorial = N * N2;
        System.out.println(factorial);
        
    }
}
