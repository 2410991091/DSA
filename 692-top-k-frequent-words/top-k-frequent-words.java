class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans=new ArrayList<>();
        int n=words.length;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            String s=words[i];
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int count=0;
        PriorityQueue<String> pq=new PriorityQueue<>(
            (a,b)->{
                if(!map.get(a).equals(map.get(b))){
                    return map.get(b)-map.get(a);
                  
                }
                else{
                   return a.compareTo(b);
                   
                }
            }
        );
        for(String s:map.keySet()){
            pq.add(s);
        }
        
        while(pq.size()>0 && count<k){
ans.add(pq.poll()); 
            count++;


        }
        return ans;
    }

}