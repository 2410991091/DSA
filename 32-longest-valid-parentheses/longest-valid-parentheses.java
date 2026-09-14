class Solution {
    public int longestValidParentheses(String s) {
        int n=s.length();
        int max=0;
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    int len=i-st.peek();
                    max=Math.max(len,max);
                }
            }
         
        }
           return max;
        
    }
}