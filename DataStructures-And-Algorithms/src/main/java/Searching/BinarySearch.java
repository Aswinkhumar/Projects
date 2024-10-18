package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12,23,34,45,67,87,95};
        int k = 23;
        System.out.println(findIndex(arr,k, 0, arr.length));
    }
/*
Binary search using recursion
 */
    private static int findIndex(int[] arr, int target, int start, int end) {
        int middle = start + end / 2;
        if(arr[middle] == target)
            return middle;
        else if(arr[middle] < target)
            return findIndex(arr, target,middle+1, end);
        else
            return findIndex(arr, target, start, middle-1);
    }
}
