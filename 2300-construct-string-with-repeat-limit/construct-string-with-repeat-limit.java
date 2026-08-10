class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder ans=new StringBuilder();
        int i=25;
        while(i>=0){
            while(i>=0 && freq[i]==0){
                i--;
            }
            if(i<0){
                break;
            }
            int count=Math.min(freq[i],repeatLimit);
            for(int k=0;k<count;k++){
                ans.append((char)(i+97));
            }
            freq[i]=freq[i]-count;
            if(freq[i]>0){
                int j=i-1;
                while(j>=0 && freq[j]==0){
                    j--;
                }
                if(j<0){
                    break;
                }
                ans.append((char)(j+97));
                freq[j]--;
            }
        }
return ans.toString();
        
    }
}