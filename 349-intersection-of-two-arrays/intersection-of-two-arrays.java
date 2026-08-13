class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        for(int f:nums2){
            if(set.contains(f)){
                list.add(f);
                set.remove(f);
            }
        }
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
     return ans;   
    }
}