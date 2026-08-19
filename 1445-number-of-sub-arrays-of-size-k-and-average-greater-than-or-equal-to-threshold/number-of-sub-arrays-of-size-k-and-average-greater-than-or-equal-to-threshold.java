class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int n=arr.length;
        int sum=0;
        int avg=1;
        int total=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        avg=sum/k;
        if(avg>=threshold){
            total++;
        }
        for(int i=k;i<arr.length;i++){
            sum-=arr[i-k];
            sum+=arr[i];
            avg=sum/k;
             if(avg>=threshold){
            total++;
        }

        }
        return total;
    }
}