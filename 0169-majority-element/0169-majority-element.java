class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;

int ele=0;
int count=0;

for(int i=0;i<n;i++){
    if(count==0){
        count=1;
        ele=nums[i];
        
    }
    else if(nums[i]==ele){
        count++;
    }
    else{
        count--;
    }
}
    int cnt=1;
    for(int j=0;j<n;j++){
        if(ele==nums[j]){
            cnt++;
        }
    }
    if(cnt>n/2){
        return ele;
    }



return -1;
}
}
// for(int i=0;i<n;i++){
//     int count=0;
//     for(int j=0;j<n;j++){
//     if(nums[j]==nums[i]){
//         count++;
//     }
//     }

//     if(count > n/2){
//     return nums[i];
//     }
    
// }

// return -1;
// }