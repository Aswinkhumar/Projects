package Strings;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "the sky  is blue";
        System.out.println(reverseWords(str));
    }

    private static String efficientSolution(String str){
        str = str.trim();

        String[] words = str.split("\\s+"); // \\ represents any white space  characters (space, tab, newline). + indicates one or more.
        StringBuilder result = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            result.append(words[i]);
            if(i!=0){
                result.append(" ");
            }
        }
        return result.toString();
    }

    private static String reverseWords(String str) {
        str = str.trim();
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ' ' && arr[i+1] == ' '){
                i++;
            }
            if(arr[i] != ' '){
                sb.append(arr[i]);
            }
            if(arr[i] == ' ' || i == str.length()-1){
                if(result.length() == 0){
                    result.append(sb);
                }
                else{
                    result = sb.append(" ").append(result.toString());
                }
                sb = new StringBuilder();
            }
        }
        return result.toString();
    }
}
