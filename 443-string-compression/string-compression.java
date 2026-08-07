class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            char ch = chars[i];
            int c = 1;

            while (i < n - 1 && ch == chars[i + 1]) {
                c++;
                i++;
            }

            chars[index++] = ch;

            if (c > 1) {
                String s = String.valueOf(c);
                for (char digit : s.toCharArray()) {
                    chars[index++] = digit;
                }
            }
        }

        return index;
    }
}