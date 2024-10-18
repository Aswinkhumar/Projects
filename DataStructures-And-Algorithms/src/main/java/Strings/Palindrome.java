package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "malayalam";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        int start=0;
        int end = str.length()-1;
        while (start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
