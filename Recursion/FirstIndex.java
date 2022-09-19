package Recursion;

public class FirstIndex {

    public static int lastindex(int[] a, int endIndex, int key) {

        int j = 0;
        if (endIndex == a.length) {

            return -1;
        }
        if (a[endIndex] == key) {
            return endIndex;
        } else {
            int lastoccur = lastindex(a, endIndex - 1, key);
            return lastoccur;
        }

    }

    public static int firstindex(int[] a, int startindex, int key) {

        if (startindex == a.length) {
            return -1;
        }
        if (a[startindex] == key) {
            return startindex;
        } else {
            int firstoccur = firstindex(a, startindex + 1, key);
            return firstoccur;
        }

    }

    public static int[] allIndices(int[] a, int index, int key, int fsf){
        if(index == a.length){
            return new int[fsf];
        }
        if(a[index] == key){
            int[] arr1 = allIndices(a, index +1 , key , fsf+1);
            arr1[fsf] = index;
            return arr1;
        }
        else{
            int[] arr1 = allIndices(a, index + 1, key ,fsf);
            return arr1;
        }

    }

    public static void main(String[] args) {

        int[] arr = { 9, 10, 8, 8 };
        int key = 8;

        System.out.println("ELEMENT AT FIRST OCCURENCE");
        int firstLocation = firstindex(arr, 0, key);
        System.out.println(firstLocation);
        
        System.out.println("ELEMENT AT LAST OCCURENCE");
        int lastLocation = lastindex(arr, arr.length - 1, key);
        System.out.println(lastLocation);

        System.out.println("ELEMENT AT ALL OCCURENCE");
        int[] allLocation = allIndices(arr, 0, 8, 0);
        for(int i=0;i<allLocation.length;i++){
            System.out.println(allLocation[i]);
        }

    }
}
