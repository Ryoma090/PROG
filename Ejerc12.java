

public class Ejerc12 {

    public static void main(String[] args) {
        System.out.println("a)Los numeros del 50 al 100");
        for (int num = 50; num <= 100; num++) {
            System.out.println(num);
        }
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("b) El orden inversa");
        for (int num2 = 100; num2 >= 50; num2--) {
            System.out.println(num2);
        }
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("c) Los números pares del 20 al 0 por orden decreciente");

        for (int num3 = 20; num3 >= 0; num3 -= 2) {
            System.out.println(num3);
        }
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("d) Los números impares entre lo 90 y el 130 por orden creciente");

        for (int num4 = 90; num4 <= 130; num4++) {
            if (num4 % 2 != 0) {

                System.out.println(num4);
            }
        }
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("e) Los múltiplos de 5 entre el 70 y el 25 por orden decreciente (70, 65, ..30 ,25)");

        for (int num5 = 70; num5 >= 25; num5--) {
            if (num5 % 5 == 0) {

                System.out.println(num5);

            }
        }
        System.out.println("------------------------------------------------------------------------------");
    }
}
