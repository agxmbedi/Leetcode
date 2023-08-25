class Solution {
    public int findDuplicate(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
        // for(int num : nums) {
        //     if(!set.add(num)) {
        //         return num;
        //     }
        // }
        // return -1;
    //     int count[] = new int [nums.length];
    // for(int i = 0; i<nums.length; i++){
    //     count[nums[i]]++;
    //     if(count[nums[i]] > 1){
    //         return nums[i];
    //     } 
    // }
    // return nums.length;
//      Arrays.sort(nums);
//     for(int i = 0; i < nums.length - 1; i++){
//         if(nums[i] == nums[i + 1]){
//             return nums[i];
//         }
//     }
//     return nums.length;
// }
 int low = 0,high = nums.length - 1,cnt;
        while(low <= high){
            int mid = low + (high - low)/2;
            cnt = 0;
            for(int num:nums){
                if(num <= mid){
                    cnt++;
                }
            }
            if(cnt <= mid){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
    return low; }
}
    
        
    
