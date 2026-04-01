class Solution {
    public void rec(int[] nums,List<Integer> ds,List<List<Integer>> ans,boolean[] freq){
        int n=nums.length;
        if(ds.size()==n){
            ans.add(new ArrayList<>(ds));
        }
        for(int i=0;i<n;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                rec(nums,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
               

            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean[] freq=new boolean[nums.length];
        rec(nums,ds,ans,freq);
        return ans;
        
    }
}