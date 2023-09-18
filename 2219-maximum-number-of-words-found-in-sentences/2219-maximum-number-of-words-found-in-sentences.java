class Solution {
    public int mostWordsFound(String[] sentences) {
      int max=0;
      for(String x : sentences ){
          int currlen=x.split(" ").length;
          if(max<currlen)
              max=currlen;
      }
        return max;}
}