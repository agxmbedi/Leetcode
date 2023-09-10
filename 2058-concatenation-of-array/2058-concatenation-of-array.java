class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int nn= n+n ;
        int ans[]=new int [ nn ];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
        }
        int j=0;
        for(int i=n;i<nn;i++){
            ans[i]=nums[j];
            j++;

        }
        
   return ans; }
}