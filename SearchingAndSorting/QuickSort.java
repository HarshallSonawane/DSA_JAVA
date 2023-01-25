import java.util.Arrays;

public class QuickSort {

    static public void Quicksort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    static void sort(int[] array, int l, int r) { 
        //l = start | r = end
        if (l < r) {
            
            int pivot = array[l];
            
            int i = l;
            int j = r;
            while (i < j) {
                
                i += 1;
                
                while (i <= r && array[i] < pivot) {
                    i += 1;
                }
                
                while (j >= l && array[j] > pivot) {
                    j -= 1;
                }

                if (i <= r && i < j) {
                    swap(array, i, j);
                }
            }
            
            swap(array, l, j);
            sort(array, l, j - 1);
            sort(array, j + 1, r);
        }
    }

   
    static void swap(int[] array, int i, int j) {
        if (i >= 0 && j >= 0 && i < array.length && j < array.length) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] {
                35,50,15,25,80,20,90,45
        };

        Quicksort(array);
        System.out.println("Sorted: " + Arrays.toString(array));
    }

}