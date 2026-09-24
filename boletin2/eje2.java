package boletin2;

/**
 * eje2
 */
public class eje2 {

    public static void main(String[] args) {
        int cont1 = 1;
        int cont2= 1;
        
        while(cont1<=20){
            System.out.println("cont1: " + cont1);
            cont1 ++;
        }
        do{
            System.out.println("cont2: " + cont2);
            cont2 ++;
        }while(cont2<20);
        for(int cont3 = 0; cont3<20 ; cont3 = cont3 + 2){
            System.out.println("cont3: " + cont3);
        }
    }
}