class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())return "";
        int freq[]=new int[123];
        for(char ch:t.toCharArray()){
            freq[ch]++;
        }
    int count=t.length();
    int left=0;
    int right=0;
    int start=0;
    int minlen=Integer.MAX_VALUE;
    while(right<s.length()){
        char ch=s.charAt(right);
        if(freq[ch]>0){
            count--;

        }
        freq[ch]--;
        //shrink
        while(count==0){
            int len=right-left+1;
            if(len<minlen){
                minlen=len;
                start=left;
            }

            char c=s.charAt(left);
            freq[c]++;
            if(freq[c]>0){
                count++;
            }
            left++;

        }
        right++;
    }
    if(minlen!=Integer.MAX_VALUE){
      return s.substring(start,start+minlen);  
    }
    return "";
    }
}