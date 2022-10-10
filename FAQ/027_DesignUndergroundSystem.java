class Pair {
    String name;
    int time;
    Pair(String n,int t) {
        name=n;
        time=t;
    }
}

class Avg {
    int taken,count;
    Avg(int t,int c) {
        taken=t;
        count=c;
    }
}
class UndergroundSystem {
    Map<Integer,Pair>in;
    Map<String,HashMap<String,Avg>>t;

    public UndergroundSystem() {
        in=new HashMap<>();
        t=new HashMap<>();
        
    }
    
    public void checkIn(int id, String stationName, int x) {
        in.put(id,new Pair(stationName,x));
        t.putIfAbsent(stationName,new HashMap<>());
    }
    
    public void checkOut(int id, String stationName, int x) {
        Pair p=in.get(id);
        String from=p.name;
        int pre=p.time;
        int curr=x-pre;
        Map<String,Avg>temp=t.get(from);
        if(temp.get(stationName)==null) {
            Avg a=new Avg(curr,1);
            temp.put(stationName,a);
        } else {
            Avg a=temp.get(stationName);
            temp.put(stationName,new Avg(a.taken+curr,a.count+1));
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
        Map<String,Avg>temp=t.get(startStation);
        return (double)((double)temp.get(endStation).taken/(double)temp.get(endStation).count);
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */