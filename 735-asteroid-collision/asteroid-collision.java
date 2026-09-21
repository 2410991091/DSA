class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();

        for (int ele : asteroids) {
            boolean flag = true;

            while (ele < 0 && !st.isEmpty() && st.peek() > 0) {
                if (-ele > st.peek()) {
                    st.pop();
                }
                else if (st.peek() > -ele) {
                    flag = false;
                    break;
                }
                else {
                    st.pop();
                    flag = false;
                    break;
                }
            }

            if (flag) {
                st.push(ele);
            }
        }

        int res[] = new int[st.size()];

        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }

        return res;
    }
}