class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        
        int idx=0;
        for(int i=0;i<n;i++){
            if(i<n-1 && nums[i]==nums[i+1]) continue;
            else {
                nums[idx]=nums[i];
                idx++;
                
            }
        }
return idx;
    }
}