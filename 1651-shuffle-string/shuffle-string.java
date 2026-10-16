class Solution {
    public String restoreString(String s, int[] indices) {
        char res [] = new char [s.length()];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            res[indices[i]]=ch;
        }
        return new String(res);
    }
}