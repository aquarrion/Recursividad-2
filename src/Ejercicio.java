public class Ejercicio {

    //FIBONACCI
    public static int funcionFibonacci(int num) {
        return num != 0 && num != 1 ? funcionFibonacci(num - 1) + funcionFibonacci(num - 2) : num;
    }

    //INDICE VECTOR
    public static int indiceVector(int[] vector, int indice) {
        int contador = 0;
        if (indice == vector.length - 1) {
            if (indice == vector[indice]) {
                ++contador;
            }
        } else {
            if (indice == vector[indice]) {
                ++contador;
            }

            contador += indiceVector(vector, indice + 1);
        }

        return contador;
    }

    public static boolean indiceVector(int[] vector) {
        return indiceVector(vector, 0) > 0;
    }

}
