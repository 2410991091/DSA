class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int ans=0;
        while(left<=right){
            int m=left+(right-left)/2;
            if(target==nums[m])return m;
            else if(target>nums[m]) left=m+1;
            else right=m-1;
            
        }
       return left;
    }
}