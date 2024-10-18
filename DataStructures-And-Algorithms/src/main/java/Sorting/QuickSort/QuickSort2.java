package Sorting.QuickSort;
/*
Quick sort implementation using Hoare's partition algorithm.
 */
public class QuickSort2 {
    public static void main(String[] args) {
        int arr[] = {5,13,6,9,12,11,8};
        qSort(arr,0,arr.length-1);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    private static void qSort(int[] arr, int start, int end) {
        if(start < end){
            int pivot = hoarePartition(arr,start,end);
            qSort(arr,start,pivot);
            qSort(arr,pivot+1,end);
        }
    }

    private static int hoarePartition(int[] arr, int start, int end) {
        int i = start-1;
        int j = end+1;
        int pivot = arr[start];

        while (true){
            do{
                i++;
            }while (arr[i] < pivot);
            do{
                j--;
            }while (arr[j] > pivot);
            if(i >= j) return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
