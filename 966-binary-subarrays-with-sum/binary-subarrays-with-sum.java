class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int sum=0;
        int n=nums.length;
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int check=sum-goal;
            if(map.containsKey(check)){
                count+=map.get(check);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }


        return count;
        
    }
}