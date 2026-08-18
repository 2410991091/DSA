class Solution {
    public int maxProfit(int[] prices) {
       
        int a=prices[0];
        int min=a;
       
        int max=0;
        for(int i=1;i<prices.length;i++){
   
            if(prices[i] < min) {
                min = prices[i];
            }
            if(prices[i]>min){
                max=Math.max(prices[i]-min,max);
            }
            a=prices[i];
            


            
        }
return max;
       
    }
}