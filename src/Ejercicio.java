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


    //busqueda binaria
    //busqueda secuencial

    /** Buscar tablas desordenadas Búsqueda secuencial */
    public static int busquedaSecuencial(int[] listaDatos, int objeto) {
        for (int i = 0; i < listaDatos.length; i++) {
            if (listaDatos[i] == objeto)
                return i;
        }
        return -1;
    }

    /**
     * Búsqueda binaria, para listas ordenadas
     */
    public static int busquedaBinaria(int[] listaDatos, int objeto) {
        int mid = 0;
        int first = 0;
        int last = listaDatos.length - 1;

        while (first <= last) {
            mid = (first + last) / 2;
            if (objeto == listaDatos[mid])
                return mid;
            else {
                if (objeto > listaDatos[mid])
                    first = mid + 1;
                else
                    last = mid - 1;
            }
        }
        return -1;
    }

}
