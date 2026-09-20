class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        
        int sum=0;
        int idx=1;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int x=123-(int)ch;
           int pro=x*idx;
           idx++;
        
            sum+=pro;
            
        }
        return sum;
        
    }
}