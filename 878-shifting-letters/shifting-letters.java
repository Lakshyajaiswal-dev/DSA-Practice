class Solution {
    public String shiftingLetters(String s, int[] shifts) {
      char[] arr = s.toCharArray();
       int totalShift = 0;

          for (int i = arr.length - 1; i >= 0; i--) {
           totalShift = (totalShift + shifts[i]) % 26;
               arr[i] = (char) ('a' + (arr[i] - 'a' + totalShift) % 26);
           }
         return new String(arr);
    }
}