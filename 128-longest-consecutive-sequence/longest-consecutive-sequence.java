class Solution {
    public int longestConsecutive(int[] nums) {
        int count=0;
        int max=0;
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int fn=0;
        int current=0;
        for(int x:set){
            if(!set.contains(x-1)){
                count=1;
                current=x;
            }
            while(set.contains(current+1)){
                count++;
                current++;
            }
            max=Math.max(count,max);
            
        }
        return max;
        
    }
}