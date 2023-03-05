package Lessons.Backtracking.Assignments;
import java.util.*;
public class GenerateParanthesis {
    List<String>res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        rec(n,n,0,"");
        return res;
    }
    public void rec(int o,int c,int idx,String str) {
        if(o>c) return;
        if(o==0 && o==c) {
            res.add(str);
            return;
        }
        if(o>0) {
            rec(o-1,c,idx+1,str+'(');
        }
        if(c>0) {
            rec(o,c-1,idx+1,str+')');
        }
    }
}
