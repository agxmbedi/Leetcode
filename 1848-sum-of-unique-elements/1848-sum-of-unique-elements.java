class Solution {
    public int sumOfUnique(int[] nums) {
    int n=nums.length;
    int sum=0;
    int c[]=new int[101];

    for(int i=0;i<n;i++){
        c[nums[i]]++;
    }
    for(int i=0;i<=100;i++){
        if(c[i]==1){
            sum+=i;

        }
    }
    return sum;
    }
}