class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0;
        int n=s.length();
        int left=0;
        int right=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(right<n){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            len=Math.max(len,right-left+1);
            right++;

        }
     return len;   
        
    }
}