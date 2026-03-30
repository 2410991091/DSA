class Solution {
    public static void rec(int idx,int[] nums,List<Integer> a,List<List<Integer>> ans){
        int n=nums.length;
        if(idx==n){
            ans.add(new ArrayList<>(a));
            return;
        }
        a.add(nums[idx]);
        rec(idx+1,nums,a,ans);
        a.remove(a.size()-1);
        rec(idx+1,nums,a,ans);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> a=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        rec(0,nums,a,ans);
        return ans;
        
        
    }
}