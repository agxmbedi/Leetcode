class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
         int n=nums.length;
        //     int z=nums[n-1];
        //     int sum=0;
        //     int sum1=0;
        //     for(int i=0;i<n;i++){
        //          sum=sum+nums[i];

        //     }
        //     for(int j=z;j>=0;j--){
        //         sum1=sum1+j;

        //     }
        //     return sum1-sum;

            int a[]=new int[n+1];
            for(int i=0;i<=n;i++){
                a[i]=i;
            }
            for(int j=0;j<n;j++){
                if(a[j]!=nums[j])
                return a[j];
            }

        


return a[n];}
}