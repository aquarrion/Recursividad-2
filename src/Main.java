import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //FIBONACCI
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número de elementos a mostrar de la series: ");
        int limite = teclado.nextInt();
        teclado.close();

        for(int i = 0; i < limite; ++i) {
            System.out.print(Ejercicio.funcionFibonacci(i) + ", ");
        }

        System.out.println(" ");



    }
}
