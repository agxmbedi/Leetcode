class Solution {

    public static void reverse(int nums[],int start , int end){

        while(start <=end){
            int temp;
            temp = nums[end];
            nums[end] = nums[start];
            nums[start]=temp;
            start ++;
            end --;

        }
        



    }
    public void rotate(int[] nums, int k) {
        int start=0;
        int end=nums.length-1;
        if(k>nums.length){
            k=k%nums.length;
        }
    reverse( nums,start,end);
       reverse(nums,start,k-1);
       reverse(nums,k,end);

        
        
    }
}