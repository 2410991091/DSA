class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int mx=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
                mx=Math.max(mx,count);
            }
            else{
                count=0;
            }
        }
        return mx;
        
    }
}