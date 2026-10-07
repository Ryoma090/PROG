package apuntes;

public class EjemplosFunciones {

    public static void estrellas() {
        System.out.println("************************");
    }
    public static void estrellas2(int n) {                 //Importante
        
        for(int i = 0; i< n; i++){
            System.out.print("*");

        }
        System.out.println();
    }
    public static void otras(String m, int a) {
        
    }
    public static int sumaEnteros(int a, int b){
        int resultado = a + b;
        return resultado;
    }
    public static void main(String args[]){
        int aux= sumaEnteros(10, 20);
        System.out.println(aux);
estrellas();

System.out.println();
for (int i = 0; i < 5; i++) {
estrellas();
}
estrellas2(5);
System.out.println(" Fin ");
otras("hola", 20);

}
}
