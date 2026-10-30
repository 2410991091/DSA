class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int n=nums.length;
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];

            int tar=sum-k;
            if(map.containsKey(tar)){
                count+=map.get(tar);

            }

            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}