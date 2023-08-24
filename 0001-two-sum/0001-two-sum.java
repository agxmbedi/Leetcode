class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int x=target-num;

            if(a.containsKey(x)){
                return new int[]{i,a.get(x)};
            }
            a.put(nums[i],i);
        }
        return new int[]{-1,-1};

        
        
        
    }
        
        
        
        }