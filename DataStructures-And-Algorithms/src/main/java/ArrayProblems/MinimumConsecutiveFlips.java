package ArrayProblems;

public class MinimumConsecutiveFlips {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,1,0,0,0,0,1};
        findFlips(arr, arr.length);
    }

    private static void findFlips(int[] arr, int n) {

        for(int i=1; i<n ; i++)
        {
            if(arr[i] != arr[i-1]) {
                if (arr[i] != arr[0]) {
                    System.out.print("Flip from index " + i + " to ");
                }
                else{
                    System.out.print(i-1 +"\n");
                }
            }
        }
    }
}
