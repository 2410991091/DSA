class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int sum=0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int check=sum-k;
            if(map.containsKey(check)){
                
                count += map.get(check);
            }
                map.put(sum,map.getOrDefault(sum,0)+1);
            
            


        }
return count;
        
    }
}