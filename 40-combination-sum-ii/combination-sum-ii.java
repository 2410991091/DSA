class Solution {




    public static void rec(int idx,int[] arr,int target,List<Integer> ds,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(ds));

        }

        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            ds.add(arr[i]);

rec(i+1,arr,target-arr[i],ds,ans);

ds.remove(ds.size()-1);


        }
    }
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        rec(0,arr,target,ds,ans);
        return ans;
        
    }
}