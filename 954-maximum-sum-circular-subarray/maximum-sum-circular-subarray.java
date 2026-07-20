class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
        int total=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            total+=nums[i];

            max=Math.max(sum,max);
            if(sum<0) sum=0;


        }
        int minsum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            minsum+=nums[i];
            min=Math.min(minsum,min);
            if(minsum>0) minsum=0;
        }
        if (max < 0)
            return max;
        return Math.max(max,total-min);
    }
}