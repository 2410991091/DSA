class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int[] pos=new int[n/2];
        int l=0;
        int m=0;
        int k=0;
        int[] neg=new int[n/2];
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                pos[l]=nums[i];
                l++;

            }
            else{
                neg[m]=nums[i];
                m++;
            }
        }
        int i=0;
        int j=0;
        while(i<pos.length || j<pos.length){
            ans[k]=pos[i];
            k++;
            i++;
            ans[k]=neg[j];
            k++;
            j++;

        }
return ans;
        
    }
}