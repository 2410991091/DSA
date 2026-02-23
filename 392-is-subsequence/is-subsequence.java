class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;   // match → move s
            }
            j++;       // always move t
        }

        return i == s.length();
    }
}