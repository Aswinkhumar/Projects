package Sorting;

public class FindKthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {31,21,11,51,16,14};
        int k = arr.length ;
        int start = 0, end = arr.length-1;
        while(start <= end){
            int ptr = lomutoPartition(arr, start, end);
            if(ptr == k-1){
                System.out.println(arr[ptr]);
                break;
            }
            else if(ptr < k-1){
                start = ptr+1;
            }
            else{
                end = ptr-1;
            }
        }
    }

    private static int lomutoPartition(int[] arr, int start, int end){
        int pivot = arr[end];
        int index = start-1;
        for(int i=start; i<end; i++){
            if(arr[i]<pivot){
                index++;
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
        index++;
        int temp = arr[end];
        arr[end] = arr[index];
        arr[index] = temp;
        return index;
    }
}
