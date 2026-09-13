class Solution {
    public int[] frequencySort(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=nums[i];
            map.put(num,map.getOrDefault(num,0)+1);

        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(
            (a,b)->{
                if(!map.get(a).equals(map.get(b))){
                    return map.get(a)-map.get(b);
                }
                else{
                    return b-a;
                }
            }

        );

        for(int x:map.keySet()){
            pq.add(x);
        }
int idx=0;
        while(!pq.isEmpty()){
             int x=pq.poll();

            for(int i=0;i<map.get(x);i++){
                ans[idx++]=x;
            }
        }
    return ans;    
    }
}