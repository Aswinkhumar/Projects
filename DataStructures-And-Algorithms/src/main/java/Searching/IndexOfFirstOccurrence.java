package Searching;
/*
Given a sorted array with duplicate elements.
Task is to find the first occurrence of the target element.
 */
public class IndexOfFirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,10,10,10,20,20,30};
        int k =  30;
        System.out.println(findFirstIndex(arr,k));
    }

    public static int findFirstIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int index=-1;
        for(int i=0; i<arr.length; i++){
            int middle = (start+end)/2;
            if(arr[middle] == target){
                index = middle;
                end = middle-1;
            }
            else if(arr[middle] < target){
                start = middle+1;
            }
            else{
                end = middle-1;
            }
        }
        return index;
    }


}
