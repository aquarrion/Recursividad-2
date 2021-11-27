import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //FIBONACCI
        /*Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número de elementos a mostrar de la series: ");
        int limite = teclado.nextInt();
        teclado.close();

        for(int i = 0; i < limite; ++i) {
            System.out.print(Ejercicio.funcionFibonacci(i) + ", ");
        }

        System.out.println(" ");*/

        //indicevector
        /*int[] vector={10,8,2,6,4,2,1,0};
        System.out.println(Ejercicio.indiceVector(vector));*/

        //indicevector-2
        int datalist1[] = {23, 56, 73, 77, 26, 65, 41, 34, 12, 74, 37};
        int datalist2[] = {23, 28, 33, 34, 41, 47, 59, 71, 77, 82, 90};

        System.out.println(Ejercicio.busquedaSecuencial(datalist1,77));
        //System.out.println(Ejercicio.busquedaBinaria(datalist2,33));ntln(Ejercicio.sumaVector(vector, 0));*/

    }
}
