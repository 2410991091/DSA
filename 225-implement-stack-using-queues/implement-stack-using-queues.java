class MyStack {
    Queue<Integer> q=new LinkedList<>();
    int size;

    public MyStack() {
        size=0;
        
    }
    
    public void push(int x) {
        q.add(x);
        for(int i=1;i<=q.size()-1;i++){
            q.add(q.remove());
        }
        size++;
        
    }
    
   public int pop() {
    size--;
    return q.remove();  //  removes + returns top element
}
    
    public int top() {
        int x=q.peek();
        return x;
        
    }
    
    public boolean empty() {
        if(size==0) return true;
        else return false;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */