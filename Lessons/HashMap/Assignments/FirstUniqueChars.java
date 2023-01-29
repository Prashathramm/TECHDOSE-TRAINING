package Lessons.HashMap.Assignments;
import java.util.*;;
public class FirstUniqueChars {
    public int firstUniqChar(String s) {
        Map<Character,Integer>map=new LinkedHashMap<>();
        for(int i=0;i<s.length();++i) {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:map.keySet()) {
            if(map.get(ch)==1) return s.indexOf(ch);
        }
        return -1;
    }
}
