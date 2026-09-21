class MinStack {
    Stack<Integer> st1;
    Stack<Integer> st2;

    public MinStack() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int value) {
        int x = value;
        st1.push(value);

        if (st2.isEmpty() || x <= st2.peek()) {
            st2.push(x);
        }
    }

    public void pop() {
        int x = st1.pop();

        if (st2.peek().equals(x)) {
            st2.pop();
        }
    }

    public int top() {
        int x = st1.peek();
        return x;
    }

    public int getMin() {
        int x = st2.peek();
        return x;
    }
}