class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
    String[] arr=s.split("\\s");
    int n=s.length();
      int p = arr[arr.length - 1].length();


    return p;
    }
}