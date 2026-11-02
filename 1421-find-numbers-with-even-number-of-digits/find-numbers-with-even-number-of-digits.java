class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
    int f=0;
        for(int i=0;i<n;i++){
            int count=0;
            int x=nums[i];
            while(x!=0){
                int d=x%10;
                count++;
                x=x/10;
            }
            if(count%2==0){
                f++;
            }

        }
        return f;
        
    }
}