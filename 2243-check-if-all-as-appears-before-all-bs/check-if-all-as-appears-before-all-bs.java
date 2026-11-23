class Solution {
    public boolean checkString(String s) {
        boolean seenB = false;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a'&& seenB==true){
                   return false;
            }
            else if (ch == 'b'){
                seenB = true;
            }
        }
        return true;
    }
}