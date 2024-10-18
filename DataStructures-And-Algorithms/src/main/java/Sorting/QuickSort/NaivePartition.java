package Sorting.QuickSort;

public class NaivePartition {
    public static void main(String[] args) {
        int[] arr = {5,13,6,9,12,11,8};
        int partitionIndex = 6;
        naivePartition(arr,0,arr.length-1,partitionIndex);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    private static void naivePartition(int[] arr, int start, int end, int k) {
        int[] temp = new int[end-start+1];

        int index=0;

        for (int i = 0; i <= end; i++) {
            if(arr[i] <= arr[k] && i!=k) {
                temp[index] = arr[i];
                index++;
            }
        }
        temp[index++] = arr[k];
        for (int i = 0; i <= end; i++) {
            if(arr[i] > arr[k]){
                temp[index] = arr[i];
                index++;
            }
        }

        /*for (int i = 0; i <= end; i++) {
            arr[i] = temp[i];
        }*/
        System.arraycopy(temp,0, arr, 0,temp.length);
    }

}
