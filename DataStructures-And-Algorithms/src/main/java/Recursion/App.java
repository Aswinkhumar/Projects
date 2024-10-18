package Recursion;

public class App {
    public static void main(String[] args) {
        //System.out.println(ropeCutting(9, 2, 2, 2));
        // SubSetOfString
/*            String s = "ABC";
            String current = "";
            subSetOfString(s, 3, 0, current);*/


    }

    private static void subSetOfString(String s, int n, int index, String current) {
        if(index == n){
            System.out.println(current);
            return;
        }

        subSetOfString(s, n, index+1, current);
        subSetOfString(s, n, index+1, current+s.charAt(index));
    }

    private static int ropeCutting(int n, int a, int b, int c) {
        if(n < 0) return -1;
        if(n == 0) return 0;

        int result = Math.max(ropeCutting(n-a , a, b, c), Math.max(ropeCutting(n-b , a, b, c), ropeCutting(n-c , a, b, c)));

        if(result == -1) return -1;

        return result + 1;
    }

    private static int sumOfDigits(int num) {
        if(num <=0) return 0;
        return sumOfDigits(num/10) + num%10;
    }

    private static boolean isPalindrome(String str, int start, int end ) {
        if(start >= end) return true;
        if(str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome(str, start+1, end-1);
    }
}
