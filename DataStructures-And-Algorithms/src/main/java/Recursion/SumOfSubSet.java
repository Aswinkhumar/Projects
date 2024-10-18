package Recursion;

public class SumOfSubSet {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15};
        int sum = 25;
        System.out.println(solution(arr, sum , arr.length-1));
    }

    private static int solution(int[] arr, int sum, int n) {
        if(n < 0){
            return (sum == 0) ? 1 : 0;
        }
        return solution(arr,sum,n-1) +
                solution(arr,(sum - arr[n]),n-1);
    }
}
