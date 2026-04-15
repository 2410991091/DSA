class Solution {
    public void rec(int[] arr,boolean[] freq,List<Integer> ds,List<List<Integer>> ans){
        int n=arr.length;
        if(ds.size()==n){
            ans.add(new ArrayList<>(ds));
        }
        for(int i=0;i<n;i++){
            if(!freq[i]) {
                freq[i]=true;
                ds.add(arr[i]);
                rec(arr,freq,ds,ans);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
            
            

        }
    }
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        int n=arr.length;
        boolean[] freq=new boolean[n];
        rec(arr,freq,ds,ans);
        return ans;

        
    }
}