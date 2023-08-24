class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

     int row = matrix.length;
     int col = matrix[0].length;

     int s = 0;
     int e = row * col - 1;

     while(s<=e){
         int mid = s + (e-s)/2;
         int ele = matrix[mid/col][mid%col];

         if(ele == target){
             return true;
         }
         else if(ele < target){
             s = mid + 1;
         }
         else{
             e = mid - 1;
         }
     }
     return false;
     






//         int r=0;
//         int c=matrix.length-1;
//         if(matrix.length == 1 && matrix[0].length==1){
//             if(target ==matrix[0][0]){
//                 return true;
//             }
//             else {
//                 return false;
//             }
//         }
//         if(matrix.length==1){
//             int start =0;
//             int end =matrix[0].length-1;
//             while(start<end){
//                 int mid=start+(end-start)/2;
//                 if(target==matrix[0][mid]){
//                     return true;
//                  }
//                 else if(target<matrix[0][mid]){
//                     end=mid-1;
//                 }
//                 else if(target>matrix[0][mid]){
//                  start=mid+1;
//                 }
                
//             }
//             return false;



//         }

// while(r < matrix.length && c >=0){
//     if(matrix[r][c]==target){
//         return true;
//     }
//     if(matrix[r][c]<target){
//         r++;
//     }
//     else {
//         c--;
//     }
    
// }        
//   return false ; }
}
}