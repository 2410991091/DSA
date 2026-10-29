class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        int right=0;
        int count=0;
        int len=0;
        int max=0;
        while(right<n){
          if(nums[right]==0){
            count++;
          }
//shrink the window when count greater than k
          while(count>k){
             if (nums[left] == 0) {
                    count--;
                }
            left++;

          }
max=Math.max(max,right-left+1);
          right++;

        }


        return max;
        
    }
}