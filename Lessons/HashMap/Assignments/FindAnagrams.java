package Lessons.HashMap.Assignments;
import java.util.*;
public class FindAnagrams {
    public List<Integer> findAnagrams(String s,String p) {
        if(p.length()>s.length()) {
            return new ArrayList<>();
        }
        int[] a=new int[26],b=new int[26];
        List<Integer>l=new ArrayList<>();
        for(char ch:p.toCharArray()) {
            a[ch-'a']++;
        }
        for(int i=0;i<p.length();++i) {
            char ch=s.charAt(i);
            b[ch-'a']++;
        }
        if(Arrays.equals(a,b))
            l.add(0);
        for(int i=p.length();i<s.length();++i) {
            char ch=s.charAt(i-p.length());
            b[ch-'a']--;
            b[s.charAt(i)-'a']++;
            if(Arrays.equals(a,b))
                l.add(i-p.length()+1);
        }
        return l;
    }
}
