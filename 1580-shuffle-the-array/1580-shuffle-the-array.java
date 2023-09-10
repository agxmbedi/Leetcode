 class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n]; // Corrected the length of the result array
        int j = 0;
        
        for (int i = 0; i < n; i++) {
            result[j] = nums[i];
            j += 2;
        }
        
        j = 1; // Reset j to 1 for the second half
        
        for (int i = n; i < 2 * n; i++) {
            result[j] = nums[i];
            j += 2;
        }
        
        return result;
    }
}


