class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet();
        for(int ele:nums){
            s.add(ele);
        }
        int maxlen=0;
        for(int ele:s){
            int current=ele;
            int length=1;
            if(!s.contains(current-1)){
            while(s.contains(current+1)){
                current++;
                length++;
              
            }
            }
            maxlen=Math.max(maxlen,length);
        }
        return maxlen;
        
    }
}