class Solution {
    public int maxProfit(int[] prices) { 
        int diff=0;
        int a=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<a){
                a=prices[i];
            }
            else{
                if((prices[i]-a)>diff){
                    diff=prices[i]-a;
                }
            }
            
        }        
  return diff;  }
}