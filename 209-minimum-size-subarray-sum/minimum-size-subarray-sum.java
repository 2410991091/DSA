class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int left=0;
        int right=0;
        int len=Integer.MAX_VALUE;
        int sum=0;
        while(right<n){
            sum+=nums[right];
            while(sum>=target){
                int l=right-left+1;
                len=Math.min(len,l);
                sum-=nums[left];
                left++;
            }
            
                right++;
        }
if(len==Integer.MAX_VALUE)return 0;
else return len;
    }
}