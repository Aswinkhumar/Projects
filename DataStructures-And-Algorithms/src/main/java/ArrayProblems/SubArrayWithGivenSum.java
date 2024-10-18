package ArrayProblems;
/*
Sliding window technique with variable window (window not provided)
 */
public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {4,8,12,5};
        int sum = 17;
        System.out.println(findSubArray(arr,sum));
    }

    private static String findSubArray(int[] arr, int target) {
        int start=0;
        int end=0;
        int result=0;
        while(start <= end){
            if(result == target){
                return "Yes";
            }
            if(result > target){
                result -= arr[start];
                start++;
            }
            else{
                result += arr[end];
                end++;
            }
        }
        return "No";
    }
}
