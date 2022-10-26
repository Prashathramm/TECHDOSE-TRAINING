package Stack_and_Queue.Assignments;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        if(position.length==1) return 1;
        Stack<Double>stk=new Stack<>();
        List<Pair>l=new ArrayList<>();
        for(int i=0;i<position.length;++i) {
            l.add(new Pair(position[i],((double)(target-position[i])/speed[i])));
        }
        Collections.sort(l,(a,b)->Integer.compare(a.x,b.x));
        for(int i=0;i<position.length;++i) {
            double tt=l.get(i).y;
            if(stk.isEmpty()) {
                stk.add(tt);
            } else {
                while(!stk.isEmpty() && tt>=stk.peek()) {
                    stk.pop();
                }
                stk.push(tt);
            }
        }
        return stk.size();
    }
}
class Pair {
    int x;
    double y;
    Pair(int a,double b) {
        x=a;
        y=b;
    }
}
