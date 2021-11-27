public class Ejercicio {

    //FIBONACCI
    public static int funcionFibonacci(int num) {
        return num != 0 && num != 1 ? funcionFibonacci(num - 1) + funcionFibonacci(num - 2) : num;
    }


}
