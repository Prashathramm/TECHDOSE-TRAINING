package Lessons.Backtracking.Assignments;
import java.util.*;
public class LetterComPhNo {
    List<String>res=new ArrayList<>();
    Map<Integer,String>map=new HashMap<>();
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return res;
        String curr="",val="";
        int cnt=0,inc=2;
        for(int i=97;i<=122;++i) {
            val+=(char)(i);
            cnt++;
            if(cnt==3) {
                map.put(inc,val);
                inc++;
                val="";
                cnt=0;
            }
            if(inc==7) break;
        }
        map.put(7,"pqrs"); map.put(8,"tuv"); map.put(9,"wxyz");
        rec(digits.toCharArray(),0,digits.length(),curr);
        return res;
    }
    public void rec(char[] arr,int idx,int n,String curr) {
        if(idx>=n) {
            res.add(curr);
            return;
        }
        String val=map.get(arr[idx]-'0');
        for(int i=0;i<val.length();++i) {
            rec(arr,idx+1,n,curr+val.charAt(i));
        }
    }
}
