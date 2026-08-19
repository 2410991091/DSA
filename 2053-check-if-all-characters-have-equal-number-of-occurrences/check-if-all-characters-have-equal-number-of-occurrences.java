class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
int target=0;
        for(int i=0;i<26;i++){
         if(freq[i]>0){
            if(target==0){
                target=freq[i];
            }
            else if(target!=freq[i]){
                return false;
            }
         }
       


        }
        
        return true;
    }
}