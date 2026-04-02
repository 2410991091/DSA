class Solution {
    public static void rec(int idx,int[] arr,int target,List<Integer> ds,List<List<Integer>> ans){
        int n=arr.length;
//base case
    if(idx==n){
        if(target==0){
            ans.add(new ArrayList<>(ds));
        }
        return;
    }
    if(arr[idx]<=target){
         ds.add(arr[idx]);
        rec(idx,arr,target-arr[idx],ds,ans);
        ds.remove(ds.size()-1);
        
        
    }
    rec(idx+1,arr,target,ds,ans);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ds=new ArrayList<>();   
        List<List<Integer>> ans=new ArrayList<>();
        rec(0,candidates,target,ds,ans);
        return ans;
        
    }
}