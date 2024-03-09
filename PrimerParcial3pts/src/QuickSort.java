public class QuickSort {

    /* Esta función toma el último elemento como pivote,
       coloca el elemento pivote en su correcta posición en el arreglo
       ordenado, y coloca todos los menores (menores que el pivote)
       a la izquierda del pivote y todos los mayores a la derecha*/
    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // Índice del menor elemento
        for (int j = low; j < high; j++) {
            // Si el elemento actual es menor que el pivote
            if (arr[j] < pivot) {
                i++;


                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }



    void sort(int arr[], int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);


            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }


    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    public static void main(String args[]) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n - 1);

        System.out.println("Arreglo ordenado: ");
        printArray(arr);
    }
}