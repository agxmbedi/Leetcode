class Solution {
public:
    int subtractProductAndSum(int n) {
        int x1=1;
        int x2=0;
        int m,xx;
        
        while(n!=0){
            m=n%10;
            n=n/10;
            x1=m*x1;
            x2=m+x2;
            xx=x1-x2;
        }
         int answer =xx;
    return xx;
        
    } 
};