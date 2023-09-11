class Solution {
    public int countPrimes(int n) {
    
    if(n<=1){
        return 0;
    }
    boolean prime[]=new boolean [n+1];
    for(int i=0;i<=n;i++){
        prime[i]=true;
    }
    for(int x=2;x*x<=n;x++){
        if(prime[x]==true){
            for(int j=x*x;j<=n;j+=x){
                prime[j]=false;
            }
        }
    }
    int count=0;
    for(int i=2;i<n;i++){
        if(prime[i]==true){
count++;
        }
    }
    
    return  count; }
}