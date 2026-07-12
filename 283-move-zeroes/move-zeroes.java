class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=left+1;
        while(right<n && left<right){
         if(nums[left]!=0){
                left++;
                right++;
            }
           else if(nums[left]==0 && nums[right]!=0){
                //swap
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right++;
            }
            else if(nums[left]==0 && nums[right]==0){
                right++;
            }
            
        }
        
        
        
    }
} 