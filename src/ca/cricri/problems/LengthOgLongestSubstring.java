package ca.cricri.problems;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/
 */
public class LengthOgLongestSubstring {
    public int lengthOfLongestSubrstring(String s) {
        return lengthOfLongestSubrstringHelper(s, 0);
    }

    private int lengthOfLongestSubrstringHelper(String s, int max) {
        if(s.length() == 0) {
            return max;
        } else {
            Set<Character> mySet = new LinkedHashSet<>();
            for(int i=0; i<s.length(); i++){
                if(!mySet.contains(s.charAt(i))) {
                    mySet.add(s.charAt(i));
                } else {
                    break;
                }
            }
            return lengthOfLongestSubrstringHelper(s.substring(1), Math.max(max, mySet.size()));
        }
    }


    public static void main(String[] args) {
        LengthOgLongestSubstring lengthOgLongestSubstring = new LengthOgLongestSubstring();
        System.out.println(lengthOgLongestSubstring.lengthOfLongestSubrstring("abcabcbb"));
        System.out.println(lengthOgLongestSubstring.lengthOfLongestSubrstring("bbbbbbbbb"));
        System.out.println(lengthOgLongestSubstring.lengthOfLongestSubrstring("pwwkew"));
    }
}
