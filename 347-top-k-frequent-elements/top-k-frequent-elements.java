class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //int[] ans=new int[k];
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
      PriorityQueue<Integer> pq = new PriorityQueue<>(
    (a,b) -> map.get(a) - map.get(b)
);

// top k
for(int num : map.keySet()) {
    pq.add(num);

    if(pq.size() > k) {
        pq.poll();
    }
}

// answer
int[] ans = new int[k];

int i = 0;

while(!pq.isEmpty()) {
    ans[i++] = pq.poll();
}

return ans;
    }
}