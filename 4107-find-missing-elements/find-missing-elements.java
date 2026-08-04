class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
         for(int i=0;i<n;i++){
            if(min>nums[i]){
                min=nums[i];
            }
        }
        int sum=0;
        List<Integer> ans=new ArrayList<>();
         HashSet<Integer> set=new HashSet<>();
         for(int i=0;i<n;i++){
            set.add(nums[i]);
         }
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
            set.add(i);
            ans.add(i);
            }
        }
         
        return ans;
       
        
    }
}