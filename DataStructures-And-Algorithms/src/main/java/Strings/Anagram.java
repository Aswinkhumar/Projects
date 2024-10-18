package Strings;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String str = "listen";
        String str2 = "silent";
        System.out.println(isAnagram(str,str2));
    }

    private static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i=0; i<t.length(); i++){
            if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) > 0){
                map.put(t.charAt(i), map.get(t.charAt(i)) -1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
