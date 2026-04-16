class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            
            
            else if(ch==')' || ch=='}' || ch==']'){

    if (st.isEmpty()) return false;   // FIX

    if(st.peek()=='(' && ch==')'){
        st.pop();
    }
    else if(st.peek()=='{' && ch=='}'){
        st.pop();
    }
    else if(st.peek()=='[' && ch==']'){
        st.pop();
    }
    else{
        return false;      // mismatch FIX
    }
}

            
        }
         if(st.size()==0) return true;
            else{
                return false;
            }  
    }
}