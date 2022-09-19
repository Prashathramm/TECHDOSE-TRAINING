class Solution {
    public boolean isRobotBounded(String ins) {
        int x=0,y=0;
        char dir='N';
        for(char ch:ins.toCharArray()) {
            if(ch=='G') {
                if(dir=='N') y++;
                else if(dir=='S') y--;
                else if(dir=='E') x++;
                else x--;
            } else if(ch=='R') {
                if(dir=='N') dir='E';
                else if(dir=='S') dir='W';
                else if(dir=='E') dir='S';
                else dir='N';
            } else {
                if(dir=='N') dir='W';
                else if(dir=='S') dir='E';
                else if(dir=='E') dir='N';
                else dir='S';
            }
        }
        if(x==0 && y==0) return true;
        if(dir=='N') return false;
        return true;
    }
}