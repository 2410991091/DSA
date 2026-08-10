class Solution {
    public int maxArea(int[] arr) {
        int n=arr.length;
        int max=0;
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]<arr[j]){
                max=Math.max(arr[i]*(j-i),max);
                i++;
            }
            else{
                max=Math.max(arr[j]*(j-i),max);
                j--;
            }
        }
        return max;
    }
}