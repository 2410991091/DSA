class Solution {
    public String compressedString(String word) {
        int n=word.length();
        String ans="";
        for(int i=0;i<n;i++){
            int count=1;
            char ch=word.charAt(i);
            while(i<n-1 && ch==word.charAt(i+1)){
                count++;
                i++;

                if(count>=9){
                    break;
                }
             
            }
            // if(count>=10){

            //     String s=word.substring(i,n-1);

            //     return compressedString(s);
            // }
            ans+=Integer.valueOf(count);
            ans+=ch;

        }
        return ans;
    }
}