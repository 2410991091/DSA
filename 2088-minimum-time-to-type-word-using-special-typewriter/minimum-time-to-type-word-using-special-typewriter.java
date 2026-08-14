class Solution {
    public int minTimeToType(String word) {
        int res=0;
        int ans=0;
         char current = 'a';
        for(int i=0;i<word.length();i++){
            
            int diff=Math.abs(current-word.charAt(i));
            int anti=26-diff;
            int c=Math.min(diff,anti);
            ans+=c;
            ans+=1;
            current = word.charAt(i);

        }
    return ans;    
    }
}