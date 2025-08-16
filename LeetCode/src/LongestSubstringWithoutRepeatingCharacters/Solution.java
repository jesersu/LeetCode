package LongestSubstringWithoutRepeatingCharacters;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        for (int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
        }

        int count = 0;
        int max = 0;
        int pointer = 0;
        //ArrayList<Character> noRepeat = new ArrayList<Character>();
        Set<Character> noRepeat = new HashSet<>();
        for (char c : s.toCharArray()){
            if (noRepeat.contains(c)){
                if (max < count) {
                    max=count;
                    count = 0;
                }
                System.out.println("in: " + noRepeat.toString());
               while(noRepeat.contains(c)){
                   noRepeat.remove(s.charAt(pointer));
                   pointer++;
               }
               noRepeat.add(c);
            }else {
                noRepeat.add(c);
                count += 1;

            }
        }
        return max;
    }
}
