class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        // Case 1: all uppercase
        if (word.equals(word.toUpperCase())) return true;
        // Case 2: all lowercase
        if (word.equals(word.toLowerCase())) return true;
        // Case 3: only first letter uppercase
        if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            int i = 1, j = n - 1;
            while (i <= j) {
                char ch = word.charAt(i);
                char d = word.charAt(j);
                if (!(ch >= 'a' && ch <= 'z') || !(d >= 'a' && d <= 'z')) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
        return false;
    }
}