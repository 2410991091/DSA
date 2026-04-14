class Solution {
    public int[] singleNumber(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])) map.put(arr[i],1);
            else map.put(arr[i],map.get(arr[i])+1);
        }    
        int[] ans=new int[2];
        int idx=0;
        for(int key:map.keySet())  {
            if(map.get(key)==1){
                ans[idx++]=key;
            }
        }
            return ans;
    }
}