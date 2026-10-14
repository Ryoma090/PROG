import java.util.Scanner;

public class vol1 {
    public static void saludo(int x) {
        
        for(int i= 0; i < x; i++){
    
        System.out.println("Hola");
        }
    }
    public static void pintaMensaje(String msg, int num) {
        System.out.println(msg);
        for(int x= 0; x < num; x++){
            System.out.println("Adios");
        }
    }
    public static void pintaVariosMensajes(String msg2, int num2) {
        for(int y= 0; y < num2; y++){
            System.out.println(msg2);
        }
        
    }
    public static void suma20(int num) {
        int suma201 = 0;
        for(int w = 1; w <= num; w++ ){
            suma201 = suma201 + w;
            
        }
        System.out.println(suma201);
    }
    public static void pideNumero(String msg) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(msg);
        System.out.println(num);
    }
public static void main(String[] args) {
    saludo(2);
    pintaMensaje("Adios",4);
    pintaVariosMensajes("Adios2", 2);
    suma20(5);
    pideNumero("Dime el numero y te dire el doble");
}
}
