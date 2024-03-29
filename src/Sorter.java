import java.util.ArrayList;

public class Sorter {
    public static void main(String[] args) {

        int[] array = {51, 24, 6, 21, 98, 45, 3, 44, 71, 20, 54, 60};

    }

    public static void selectionSort(int[] arr)
    {
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void Sort2(int[] arr) {selectionSort(arr);}
   public static void insertionSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void Sort(int[] arr) {insertionSort(arr);}

}