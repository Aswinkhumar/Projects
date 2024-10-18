package Sorting.QuickSort;
/*
Lomuto partition algorithm traverses the array only once, and it is efficient that naive partition algorithm.
Time complexity: O(n)
Space complexity: O(1)
 */
public class LomutoPartition {
    public static void main(String[] args) {
        // considering the last element in the array as the partition element always.
        int arr[] = {5,13,6,9,12,11,8};
        lomutoPartition(arr,0,arr.length-1);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    /*
    If the partition element is provided as an input, then we can just move the partition element with the last element.
    Then the algorithm works as it is.
     */
    private static void lomutoPartition(int[] arr, int start, int end) {
        int partition = arr[end]; // considering the last element in the array as the partition element.
        int smallerIndex = start-1; // to maintain the array range with smaller elements that partition elements.
        for(int i=0; i<end; i++){
            if(arr[i]<partition){
                smallerIndex++;
                int temp = arr[i];
                arr[i] = arr[smallerIndex];
                arr[smallerIndex] = temp;
            }
        }
        int temp = arr[smallerIndex+1];
        arr[smallerIndex+1] = arr[end];
        arr[end] = temp;
    }
}
