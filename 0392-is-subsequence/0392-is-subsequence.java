// class Solution {
//     public boolean isSubsequence(String s, String t) {
//       int len1=s.length();
//       int len2=t.length();
//       int x=0;
//       if(len1==0){
//         return true;
//       }
//       if(len1>len2){
//         return false;
//       }
//       for(int i=0;i<len2;i++){
//         if(s.charAt(x)==t.charAt(i)){
//           if(x==len1-1){
//             return true;
//           }
//           x++;
//         }
//       }
//  return false;   }
// }
class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        int j = 0;
        
        for (int i = 0; i < tLen && j < sLen; i++) {
            if (s.charAt(j) == t.charAt(i)) 
            j++;
        }

        return j == sLen; 
    }
}