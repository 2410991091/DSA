class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int left=0;
        int right=0;
        int sum=0;
        int len=0;
        int min=Integer.MAX_VALUE;
        while(right<n){
            sum+=nums[right];

            while(sum>=target){
                len=right-left+1;
                min=Math.min(len,min);
                sum-=nums[left];
                left++;

            }
            right++;
        }
      if(min==Integer.MAX_VALUE){
        return 0;
      }  
        return min;
    }
}