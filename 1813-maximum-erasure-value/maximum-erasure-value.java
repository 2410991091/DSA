class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum=0;
        int l=0;
        int n=nums.length;
        int left=0;
        int right=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(right<n){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.get(nums[right])>1){
                map.put(nums[left],map.get(nums[left])-1);
                 l -= nums[left];
                left++;
            }
           
         
           
           l+=nums[right];
           sum=Math.max(l,sum);
            right++;
        }
        return sum;
    }
}