package Strings;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String str = "java"; // considering the input will be always in lower case.
        System.out.println(findFirstUniqueChar(str)); // findFirstUniqueChar function returns 0-based index as output.
    }

    private static int findFirstUniqueChar(String str) {
        int[] arr = new int[26];
        for(char c : str.toCharArray()){
            arr[c-'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            if(arr[(str.charAt(i) - 'a')] == 1){ // Modify this condition for First Non-Unique character in the String.
                return i;
            }
        }
        return -1;
    }
}
