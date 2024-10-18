package Sorting.QuickSort;
/*
Implementation of Quick sort using Lomuto partition.
 */
public class QuickSort1 {
    public static void main(String[] args) {
        int arr[] = {5,13,6,9,12,11,8};
        qSort(arr,0,arr.length-1);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    private static void qSort(int[] arr, int start, int end) {
        if(start < end){
            int pivot = lomutoPartition(arr,start,end);
            qSort(arr,start,pivot-1);
            qSort(arr,pivot+1,end);
        }
    }

    private static int lomutoPartition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start-1;

        for(int j = start; j<end; j++){
            if(arr[j]<pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return i+1;
    }
}
