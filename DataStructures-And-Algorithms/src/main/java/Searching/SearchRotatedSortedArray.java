package Searching;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,1,3}; // 5,1,3
        int k = 5;
        System.out.println(findIndex(arr,k));
    }

    private static int findIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int middle = start + (end-start) / 2;

            if(nums[middle] == target){
                return middle;
            }
            else if(nums[start] <= nums[middle]){
                if(nums[start] <= target && nums[middle] > target)
                {
                    end = middle-1;
                }
                else{
                    start = middle+1;
                }

            }
            else{
                if(nums[middle] < target && nums[end] >= target){
                    start = middle+1;
                }
                else{
                    end = middle-1;
                }
            }
        }
        return -1;
    }
}
