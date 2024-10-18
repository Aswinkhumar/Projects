package ArrayProblems;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int res = findMajorityElement(nums);
        System.out.println(res);
    }

    private static int findMajorityElement(int[] nums) {
        int m = nums.length/2;
        int majorityNumber = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else{
                if(map.get(nums[i]) >= m){
                    majorityNumber = nums[i];
                }
                else{
                    map.put(nums[i], map.getOrDefault(nums[i], 1)+1);
                }
            }
        }
        return majorityNumber;
    }
}
