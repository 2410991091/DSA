class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        int ls=0;
        int rs=0;
        for(int i=0;i<nums.length;i++){
            ls=totalsum-rs-nums[i];
            if(ls==rs){
                return i;
            }
            rs+=nums[i];
        }
      return -1;  
    }
}