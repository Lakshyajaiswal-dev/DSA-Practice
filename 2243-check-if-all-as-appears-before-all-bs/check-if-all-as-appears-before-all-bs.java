class Solution {
    public boolean checkString(String s) {
      int n = s.length()-1;
      for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);
        if('b'==ch){
            n = i;
             break;
        }
       
      } 
      for(int i=n+1; i<s.length(); i++){
        if('a'==s.charAt(i)){
            return false;
        }
      } 
      return true;
    }
}