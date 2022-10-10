class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>res=new ArrayList<>();
        Map<String,List<Integer>>map=new HashMap<>();
        int j=0;
        for(String s:strs) {
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String t=new String(arr);
            map.putIfAbsent(t,new ArrayList<>());
            map.get(t).add(j);
            j++;
        }
        for(String i:map.keySet()) {
            List<Integer>temp=map.get(i);
            List<String>store=new ArrayList<>();
            for(int k:temp) store.add(strs[k]);
            res.add(store);
        }
        return res;
    }
}