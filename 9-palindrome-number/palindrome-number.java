class Solution {
    public int reverse(int x){
        int rev=0;
        int p=x;
        while(x>0){
            int d=x%10;
            rev=rev*10+d;
            x=x/10;
        }
      return rev;

    }
    public boolean isPalindrome(int x) {
        if(x==reverse(x)){
            return true;
        }
        return false;

        
    }
}