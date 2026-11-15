
class Solution {
    public int numOfSubarrays(int[] arr) {

        int odd = 0;
        int even = 1;
        int prefix = 0;
        int ans = 0;

        int mod = 1000000007;

        for (int num : arr) {

            prefix += num;

            if (prefix % 2 == 0) {
                ans = (ans + odd) % mod;
                even++;
            } 
            else {
                ans = (ans + even) % mod;
                odd++;
            }
        }

        return ans;
    }
}
