class Solution {
    public String shiftingLetters(String s, int[] shifts) {
      int n = shifts.length;
      long suffixSum [] = new long[n];  
      suffixSum[n-1]= shifts[n-1];
      for(int i=n-2; i>=0; i--){
        suffixSum[i]=suffixSum[i+1]+shifts[i];
      }
      char [] ch = s.toCharArray();
      for(int i=0; i<n; i++){
        ch[i] = (char)('a'+(ch[i]-'a'+suffixSum[i])%26);
      }
      return new String (ch);
    }
}