class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        String ans="";
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(char ch:map.keySet()){
            pq.add(ch);
        }
    
         while(!pq.isEmpty()){ 
            char ch=pq.poll();

            for(int i=0;i<map.get(ch);i++){
                ans+=ch;
            }
        }
        
return ans;
        
    }
}