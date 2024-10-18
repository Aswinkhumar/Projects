package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {8,5,7,10,9};
        int[] result = selectionSort(arr);
        for(int i: result){
            System.out.print(i + " ");
        }
    }

    private static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
