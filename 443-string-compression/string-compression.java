class Solution {
    public int compress(char[] chars) {

        int n = chars.length;
        int i = 0;
        int index = 0;

        while (i < n) {

            char ch = chars[i];
            int count = 0;

            // Count consecutive same characters
            while (i < n && chars[i] == ch) {
                count++;
                i++;
            }

            // Write the character
            chars[index] = ch;
            index++;

            // Write the count if greater than 1
            if (count > 1) {
                String str = String.valueOf(count);

                for (int j = 0; j < str.length(); j++) {
                    chars[index] = str.charAt(j);
                    index++;
                }
            }
        }

        return index;
    }
}