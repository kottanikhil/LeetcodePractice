//Given a string s, find the length of the longest
//        substring
//        without repeating characters.
//
//
//
//        Example 1:
//
//        Input: s = "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
    public int lengthOfLongestSubstring(String s) {
        String s1 = "";
        int length = 0;
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(checkIfCharacter(s1, ch)){
                if(length < s1.length()){
                    length = s1.length();
                }
                s1 = "";
            } else {
                s1 = s1 + ch;
                if(length < s1.length()){
                    length = s1.length();
                }
            }
        }
        return length;
    }

    public boolean checkIfCharacter(String s1, char ch){
        boolean b1 = false;
        for(int i=0; i<s1.length() ; i++){
            if(s1.charAt(i) == ch){
                b1 = true;
            }
        }
        return b1;
    }
}