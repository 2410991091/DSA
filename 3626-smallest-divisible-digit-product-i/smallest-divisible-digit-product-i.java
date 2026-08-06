class Solution {
    public int smallestNumber(int n, int t) {
        int pro=1;
        int te=n;
        while(te!=0){
            int d=te%10;
            pro=pro*d;
            te=te/10;
        }
        if(pro%t==0){
            return n;
        }
       return smallestNumber(n+1,t);
        
    }
    
}