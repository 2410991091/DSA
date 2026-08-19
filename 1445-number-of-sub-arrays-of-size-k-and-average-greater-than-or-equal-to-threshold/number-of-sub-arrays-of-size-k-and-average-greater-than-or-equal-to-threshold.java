class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int avg=1;
        int total=0;
        int sum=0;
        int sum2=0;
         int avg2=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
           

        }
         sum2=sum;
            avg=sum/k;
            if(avg>=threshold) total++;
        
       


        for(int i=k;i<arr.length;i++){
            sum2-=arr[i-k];
            sum2=sum2+arr[i];
            int c=sum2;
           avg2=c/k;
            if(avg2>=threshold) total++;

        }
         
        return total;
    }
}