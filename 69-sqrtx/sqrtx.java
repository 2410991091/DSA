class Solution {
    public int mySqrt(int x) {
        int root=0;
        for(int i=1;i<=x;i++){
            if((long)i*i>x) break;
            root=i;
        }
        return root;

    }
}