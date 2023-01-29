package Lessons.HashMap.Assignments;
import java.util.*;
public class LongestSubWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
        Map<Character,Integer>map=new HashMap<>();
        int max=1,j=0;
        for(int i=0;i<s.length();++i) {
            char ch=s.charAt(i);
            if(map.get(ch)==null) {
                map.put(ch,i);
            } else {
                j=Math.max(map.get(ch)+1,j);
                map.put(ch,i);
            }
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}
