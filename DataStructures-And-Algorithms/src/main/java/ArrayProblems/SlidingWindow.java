package ArrayProblems;
/*
Sliding window technique with fixed window provided as an input.
 */
public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1,8,30,-5,20,7};
        int k = 3;
        //System.out.println(findMaxSubArray(arr,k));
        System.out.println(WindowSliding(arr, k));
    }

    private static int findMaxSubArray(int[] arr, int k) {
        int ptr1 = 0;
        int ptr2 = k-1;
        int result = 0;
        while(ptr2 < arr.length){
            int currentSum = findSum(arr,ptr1, ptr2);
            //System.out.println("current sum = " + currentSum);
            result =  Math.max(currentSum,result);
            ptr1++;
            ptr2++;
        }
        return result;
    }

    private static int findSum(int[] arr, int start, int end) {
        int sum = 0;
        while(start <= end){
            sum += arr[start];
            start++;
        }
        return sum;
    }

    private static int WindowSliding(int[] arr, int k){
        int currentSum = 0;
        int ptr=0;
        while(ptr < k){
            currentSum += arr[ptr];
            ptr++;
        }
        ptr=0;
        int result = currentSum;
        while(k < arr.length){
            currentSum = currentSum - arr[ptr] + arr[k];
            result = Math.max(result,currentSum);
            ptr++;
            k++;
        }
        return result;
    }
}
