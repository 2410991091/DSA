class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=i+1;
        int drop=0;
        while(i<j && j<n){
            if(nums[i]>nums[j]) drop++;
            if(j==n-1 ){
                if(nums[j]>nums[0]) drop++;
            }
            i++;
            j++;
        }
        if(drop>1) return false;
        else return true;
        
    }
}








