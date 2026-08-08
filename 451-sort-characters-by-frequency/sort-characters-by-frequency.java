class Solution {
    public String frequencySort(String s) {

        int[] freq = new int[128];
        int n = s.length();

        // Count frequency
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }

        String ans = "";

        // Start from highest frequency
        for (int i = n; i >= 1; i--) {

            // Check all ASCII characters
            for (int j = 0; j < 128; j++) {

                if (freq[j] == i) {

                    char ch = (char) j;

                    // Add character i times
                    for (int k = 0; k < i; k++) {
                        ans += ch;
                    }
                }
            }
        }

        return ans;
    }
}