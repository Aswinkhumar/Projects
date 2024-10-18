package ArrayProblems;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2,8,3,9,6,5,4};
        int[] prefixArr = findPrefixSum(arr, arr.length);
        for(int i: prefixArr){
            System.out.println(i);
        }
    }

    private static int[] findPrefixSum(int[] arr, int n) {
        int[] result = new int[n];
        result[0] = arr[0];
        for(int i=1; i<n; i++){
            result[i] = result[i-1] +  arr[i];
        }
        return result;
    }
}
