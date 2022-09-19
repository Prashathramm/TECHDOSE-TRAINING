class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int j=0;
        StringBuilder res=new StringBuilder();
        int max=-1;
        for(int i=0;i<s.length();++i) {
            if(res.length()>0 && res.indexOf(s.charAt(i)+"")!=-1) {
                while(j<i && res.indexOf(s.charAt(i)+"")!=-1) {
                    res.setCharAt(j,'#');
                    j++;
                }
                res.append(s.charAt(i));
            } else {
                res.append(s.charAt(i));
            }
            System.out.println();
            max=Math.max(i-j+1,max);
            //System.out.println(j);
        }
        return max;
    }
}