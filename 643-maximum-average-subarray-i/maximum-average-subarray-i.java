class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        double average=Integer.MIN_VALUE;
        double max=average;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        average=(double)sum/k;
        if(max<average){
            max=average;
        }
        int left=0;
        int right=k;
        while(right<nums.length){
            sum=sum-nums[left]+nums[right];
            left++;
            right++;
            average=(double)sum/k;
        if(max<average){
            max=average;
        }
        





        }
        return (double)max;
    }
}