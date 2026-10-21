class Solution {
    public int numberOfSpecialChars(String word) {
        int [] s1 = new int[52];
        // int [] s2 = new int[26];
    for(int i=0; i<word.length(); i++){
        char ch = word.charAt(i);
        if(ch>='a' && ch<='z'){
           s1[ch-'a']++;
        }
        else if (ch>='A' && ch<='Z'){
            s1[ch-'A'+26]++;
        }
       }int count=0;
       for(int i=0; i<26; i++){
        if(s1[i]!=0&&s1[i+26]!=0){
            count++;
        }
       } 
       return count; 
    }
}