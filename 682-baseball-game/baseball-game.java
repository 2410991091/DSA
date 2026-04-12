// class Solution {
//     public int calPoints(String[] operations) {
//         Stack<Integer> st=new Stack<>();
//         for(int i=0;i<operations.length;i++){
//             String ch=operations[i];
//             if(Integer.parseInt(ch)>=48 && Integer.parseInt(ch)<=57) st.push(ch);
//             else if(ch.equals('C')) st.pop();
//             else if(ch.equals('D')){
                
//                 int x=st.pop();
//                 st.push(x*2);


//             } 
//             else {
//             int x=st.pop();
//             int y=st.pop();
//             st.push(x+y);
//             }
//         }
//         int ans=0;
//         while(st.size()>0){
//             ans+=st.pop();

//         }
//         return ans;
//     }
// }





import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (String op : operations) {
            if (op.equals("C")) {
                st.pop();
            } 
            else if (op.equals("D")) {
                st.push(2 * st.peek());
            } 
            else if (op.equals("+")) {
                int top = st.pop();
                int newTop = st.peek();
                int sum = top + newTop;
                st.push(top);      // restore
                st.push(sum);
            } 
            else {
                st.push(Integer.parseInt(op));
            }
        }

        int ans = 0;
        for (int num : st) {
            ans += num;
        }

        return ans;
    }
}