// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//             Arrays.sort(nums);

//     int i= 0;
//     int s=1;
//     int e = nums.length-1;
//     List<List<Integer>> list= new ArrayList<>() ; 
//     while(s<e){
//         if(nums[i]+nums[s]+nums[e]==0){
//             List<Integer> ls;
//             ls.add(nums[i]);
//             ls.add(nums[s]);
//             ls.add(nums[e]);

//             list.add(ls);
//                 }
//         else if(nums[i]+nums[s]+nums[e]>0){
//             e--;

//         }
//         else{
//             s++;
//             i++;
//         }
//     }
//     return list;
    

        
//     }
// }
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>(); // Use ArrayList instead of Arraylist

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates to avoid duplicate triplets
            }

            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move both pointers while skipping duplicates
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}
