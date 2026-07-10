class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        int product=1;
        for(int i=0;i<n;i++){
            if(i==0){
                prefix[i]=1;
                product=product*nums[i];
            }
            else{
                prefix[i]=product;
                product=product*nums[i];
            }
        }
product=1;
    int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){
           
            ans[i]=product*prefix[i];
            product=product*nums[i];
    }
     return ans;
}
    }
   