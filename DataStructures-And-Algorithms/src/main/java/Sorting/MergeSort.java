package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,5,7,10,9};
        int[] result = mergeSort(arr, 0, arr.length-1);
        for(int i: result){
            System.out.print(i + " ");
        }
    }

    private static int[] mergeSort(int[] arr, int start, int end) {
        if(start < end){
            int mid = start + (end-start)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1, end);
            merge(arr, start, mid, end);
        }
        return arr;
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[start+i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid+i+1];
        }
        int i = 0, j = 0, k = start;
        while (i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
