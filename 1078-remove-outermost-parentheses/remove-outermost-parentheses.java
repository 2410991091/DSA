class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        int count=0;
        String ans="";
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(count==0 && ch=='('){
                count++;
            }
            else if(ch=='('){
                count++;
                ans+=ch;
            }
            else{
                count--;
                if(count==0){
                    continue;
                }
                ans+=ch;
            }
        }  
        return ans;      
    }
}