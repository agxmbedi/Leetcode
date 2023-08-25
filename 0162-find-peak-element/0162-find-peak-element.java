class Solution {
    public int findPeakElement(int[] nums) {
        int s=0;
        int e=nums.length-1;
        int n=nums.length;
        while(s<=e){
            int mid =s+(e-s)/2;
            if( (mid==0 || nums[mid]>nums[mid-1]) && (mid==n-1 || nums[mid]>nums[mid+1]) ){
                return mid;
            }
            else if(mid < n - 1 && nums[mid] < nums[mid+1]){
                s = mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
        
    }
}