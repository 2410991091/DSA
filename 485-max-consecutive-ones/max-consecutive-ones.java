class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxcount=0;
        int left=0;
        int right=0;
        while(right<nums.length){
            if(nums[right]==1){
                maxcount=Math.max(maxcount,right-left+1);
                right++;
            }
            else{
                left=right+1;
                right++;
            }
        }
       return maxcount; 
    }
}