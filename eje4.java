import java.util.Scanner;

public class eje4 {
    public static void main(String[] args) {
        int num1;
        double num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        num1 = sc.nextInt();
        System.out.println("Introduce un numero real: ");
        num2 = sc.nextDouble();
        System.out.printf("Decimal: %d, Octal: %05o, Hexadecimal: %X\n", num1, num1, num1);//DECIMAL Y OCTAL  falta hex
        System.out.printf("Real: %7.3f\n", num2);
        switch (num1) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        
            default:
                System.out.println("Syntax Error");
                break;
        }
        sc.close();
    }
    
}
