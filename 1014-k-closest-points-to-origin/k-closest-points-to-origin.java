class Solution {
    int distance(int[] points){
        return points[0]*points[0]+points[1]*points[1];
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->distance(b)-distance(a));
        for(int i=0;i<points.length;i++){
            pq.add(points[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int res[][]=new int[k][2];
        int i=0;
        while(!pq.isEmpty()){
            res[i]=pq.poll();
            i++;
        }
return res;
        
    }
}