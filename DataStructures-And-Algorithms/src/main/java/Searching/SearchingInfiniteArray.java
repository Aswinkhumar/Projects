package Searching;
/*
Searching the given integer in an infinite sized array.
 */
public class SearchingInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {12,23,34,45,67,87,95,100,120,130,145,167,178}; // consider this as an infinite sized array.
        int k = 95;
        System.out.println(findIndex(arr,k));
    }

    private static int findIndex(int[] arr, int target) {
        /*
        The idea here is to just find the end point - where end > target.
        So, we'll start with end = 1 and double the index each time until we meet the condition that end > target.
         */
        if(arr[0] == target) return 0; // explicitly handling 0 as we need to double the index -> end = end*2;

        int end = 1;

        while (arr[end] < target){
            end = end * 2;
            if(arr[end] == target) return end;
        }
        System.out.println("end = "+end);
        return binarySearch(arr,target,0,end);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end){
            int middle = start + (end-start) / 2;
            if(arr[middle] == target)
                return middle;
            else if(arr[middle] < target)
                start = middle+1;
            else
                end = middle-1;
        }
        return -1;
    }

}
