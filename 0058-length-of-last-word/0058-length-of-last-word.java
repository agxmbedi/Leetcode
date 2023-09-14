class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder sb = new StringBuilder(s);
  String [] words=sb.toString().split(" ");
  if(words.length>0){
      String lw =words[words.length-1];
return lw.length();
  }
  
        
        
    return 0;}
}