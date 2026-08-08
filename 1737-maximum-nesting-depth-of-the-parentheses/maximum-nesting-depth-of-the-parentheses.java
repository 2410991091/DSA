class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int open=0;
        int pair=0;
        int close=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
                 pair=Math.max(pair,open);
            }
            else if(ch==')')open--;
           
            
        }
        return pair;
    }
    
}