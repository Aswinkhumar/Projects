package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8,5,7,10,9};
        int[] result = insertionSort(arr);
        for(int i: result){
            System.out.print(i + " ");
        }
    }

    private static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
