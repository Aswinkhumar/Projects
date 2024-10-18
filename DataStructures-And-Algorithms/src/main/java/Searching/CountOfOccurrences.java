package Searching;

public class CountOfOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,10,10,10,20,20,30};
        int k =  1;
        System.out.println(findCount(arr,k));
    }

    public static int findCount(int[] arr, int target) {
        int firstOccurrence = IndexOfFirstOccurrence.findFirstIndex(arr,target);
        if(firstOccurrence == -1){
            return -1;
        }
        return IndexOfLastOccurrence.findLastIndex(arr,target) - firstOccurrence + 1;
    }
}
