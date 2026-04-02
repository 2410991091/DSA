class Solution {
    public static void rec(int idx,int[] arr,int target, List<Integer> ds,List<List<Integer>> ans){
        int n=arr.length;
        if(target==0){
            ans.add(new ArrayList<>(ds));
        }
        for(int i=idx;i<n;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            ds.add(arr[i]);
            rec(i+1,arr,target-arr[i],ds,ans);
            ds.remove(ds.size()-1);

        }
    }
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        Arrays.sort(arr);
        rec(0,arr,target,ds,ans);
        return ans;
        
    }
}