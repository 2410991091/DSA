class Solution {
    public boolean canJump(int[] nums) {

        if(nums.length==1){
            if(nums[0]>=1){
                return true;
            }
        }
        int n=nums.length;
        int reach=0;
        for(int i=0;i<n;i++){
            if(i>reach){
                return false;
            }
            int m=nums[i]+i;
            reach=Math.max(reach,m);
            if(reach>=n-1){
                return true;
            }


        }
        return false;
        
    }
}