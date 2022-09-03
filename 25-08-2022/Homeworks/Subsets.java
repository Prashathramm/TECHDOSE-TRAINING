import java.util.*;
public class Subsets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        char[] a=new char[len];
        for(int i=0;i<len;++i) a[i]=sc.next().charAt(0);
        solve(a,len);
    }
    public static void solve(char[] a,int len) {
        List<List<Character>>parent=new ArrayList<>();
        for(int i=1;i<=(1<<len)-1;++i) {
            List<Character>temp=new ArrayList<>();
            for(int j=0;j<len;++j) {
                if((i&(1<<j))!=0) temp.add(a[j]);
            }
            parent.add(temp);
        }
        for(List<Character>list:parent) System.out.println(list);
    }
}
