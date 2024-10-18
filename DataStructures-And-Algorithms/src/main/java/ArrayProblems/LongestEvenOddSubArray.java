package ArrayProblems;

public class LongestEvenOddSubArray {
    public static void main(String[] args) {
        int[] arr = {10, 12, 15, 8};
        int result = findSubArray(arr, arr.length);
        System.out.println(result);
    }

    private static int findSubArray(int[] arr, int length) {
        int count = 0, result = 0;

        for(int i=0; i<length; i++)
        {
            int tmp = arr[i];
            int next = (i+1 == length) ? result++ : arr[i+1];

            if((tmp%2 == 0 && next%2 != 0) || (tmp%2 != 0 && next%2 == 0))
            {
                count++;
                System.out.println("incrementing for "+arr[i]);
            }
            else
            {
                count = 0;
                System.out.println("decrementing for "+arr[i]);
            }
            result = Math.max(result,count);
        }
        return result;
    }
}
