class Solution {
    public String removeDuplicates(String s, int k) {

        int n = s.length();

        Stack<Character> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (!st1.isEmpty() && st1.peek() == ch) {

                int x = st2.pop();

                st2.push(x + 1);

                if (x + 1 == k) {
                    st1.pop();
                    st2.pop();
                }

            } else {

                st1.push(ch);
                st2.push(1);
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!st1.isEmpty()) {

            char ch = st1.pop();
            int count = st2.pop();

            for (int i = 0; i < count; i++) {
                ans.append(ch);
            }
        }

        return ans.reverse().toString();
    }
}
