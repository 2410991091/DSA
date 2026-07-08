class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int right = 0;
        int maxlen = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        while (right < n) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.get(ch) > 1) {
                char remove = s.charAt(left);
                map.put(remove, map.get(remove) - 1);
                left++;
            }

            int len = right - left + 1;
            maxlen = Math.max(maxlen, len);

            right++;
        }

        return maxlen;
    }
}