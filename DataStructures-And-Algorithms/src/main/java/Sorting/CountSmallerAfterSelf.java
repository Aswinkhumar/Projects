package Sorting;

import java.util.ArrayList;
import java.util.List;

public class CountSmallerAfterSelf {
    public static void main(String[] args) {
        int[] arr = {5,2,6,1}; // 2,1,1,0
        List<Integer> answer = countSmaller(arr);
        for(Integer i: answer){
            System.out.print(i + " ");
        }
    }
    static List<Integer> result = new ArrayList<>();
    public static List<Integer> countSmaller(int[] nums) {
        if(nums.length == 1){
            if(nums[0] == -1){
                result.add(0);
            }
            else{
                result.add(nums[0]);
            }
            return result;
        }
        if(nums.length > 1){
            int mid = nums.length/2;
            int[] left = new int[mid];
            for(int i=0; i<mid; i++){
                left[i] = nums[i];
            }
            int[] right = new int[nums.length - mid];
            for(int i=0; i<right.length; i++){
                right[0] = nums[mid+i];
            }
            countSmaller(left);
            countSmaller(right);

            int i=0,j=0,k=0;

           /* while (i<left.length && j<right.length){
                if(left[i] < )
            }*/
        }
        return result;
    }
}
