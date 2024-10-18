package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8,5,7,10,9};
        int[] result = bubbleSort(arr);
        for(int i: result){
            System.out.print(i + " ");
        }
    }

    private static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            boolean isSwapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
        return arr;
    }
}
