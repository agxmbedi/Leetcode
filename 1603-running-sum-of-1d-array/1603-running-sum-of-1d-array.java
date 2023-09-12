class Solution {
    public int[] runningSum(int[] nums) {
        int x=1;
        for(int i=1;i<nums.length;i++){
            nums[x]=nums[i]+nums[i-1];
            x++;
     
        }
        
   return nums; }
}