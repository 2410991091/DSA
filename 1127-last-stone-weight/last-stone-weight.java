class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());
        int n=stones.length;
        for(int i=0;i<n;i++){
            pq.add(stones[i]);

        }

        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();
            int diff=x-y;
            pq.add(diff);

        }
        return pq.poll();
        
    }
}