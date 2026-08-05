class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        String ans="";
        String[] arr=s.trim().split("\\s+");
        for(int i=arr.length-1;i>=0;i--){
            ans+=arr[i];
            if(i!=0){
                ans+=" ";
            }
            

        }

        return ans;
        
    }
}