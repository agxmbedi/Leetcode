class Solution {
    public int missingNumber(int[] nums) {
         int n=nums.length;
         int sum=(n*(n+1))/2;
         int s=0;
         int miss;
         for(int i=0;i<n;i++){
             s+=nums[i];
         }
         miss=sum-s;
        return miss;

//             int a[]=new int[n+1];
//             for(int i=0;i<=n;i++){
//                 a[i]=i;
//             }
//             for(int j=0;j<n;j++){
//                 if(a[j]!=nums[j])
//                 return a[j];
//             }

        


// return a[n];}
    }
}