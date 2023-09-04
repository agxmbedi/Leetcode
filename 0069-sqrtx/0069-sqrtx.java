class Solution {
    public int mySqrt(int x) {
 long s=1;
 long e=x;
        if(x<=1){
     return x;
        }
   while(s<=e){
       long mid=(s+(e-s)/2);
       long sqr =mid*mid;
       if(sqr == x){
           return (int)mid;
       }
       else if(sqr < x){
           s= mid+1;
       }
       else{
           e= mid-1;
       }
     


   }
   return (int) e;
         

        
    }
}