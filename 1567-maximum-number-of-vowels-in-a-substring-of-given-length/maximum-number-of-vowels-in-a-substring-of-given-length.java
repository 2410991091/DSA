class Solution {
    public int maxVowels(String s, int k) {
        int ans=0;
        int n=s.length();
        int v=0;
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                v++;
            }

        }
        ans=v;
        for(int i=k;i<n;i++){
            
         char remove=s.charAt(i-k);
         if(remove=='a'||remove=='e'||remove=='i'||remove=='o'||remove=='u'){
            v--;

         }
          char add=s.charAt(i);
            if(add=='a'||add=='e'||add=='i'||add=='o'||add=='u'){
            v++;

         }
         ans=Math.max(ans,v);

        }
        return ans;
    }
}