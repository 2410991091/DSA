class Solution {
    public int minBitFlips(int start, int goal) {
        int ans=start^goal;
        int c=0;
        while (ans > 0) {
            c += (ans & 1);  // check last bit
            ans = ans >> 1;      // shift right
        }
        return c;
        
    }
}