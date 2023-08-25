class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         List<Integer> ans=new ArrayList();
        int n=nums.length;
        HashSet<Integer> s=new HashSet<>();
        for(int i:nums){
          // s.add(i);
            if(s.contains(i)){
                ans.add(i);
            }
            else{
                s.add(i);
            }
            
        }
       
        return ans;
    
        
    }
}