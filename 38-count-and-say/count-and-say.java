class Solution {

    public String count(String ans) {

        String res = "";
        int count = 1;

        for (int i = 1; i < ans.length(); i++) {

            if (ans.charAt(i) == ans.charAt(i - 1)) {
                count++;
            } 
            else {
                res += count;
                res += ans.charAt(i - 1);
                count = 1;
            }
        }

        // last character/group
        res += count;
        res += ans.charAt(ans.length() - 1);

        return res;
    }

    public String countAndSay(int n) {

        String ans = "1";

        for (int i = 1; i < n; i++) {

            ans = count(ans);

        }

        return ans;
    }
}