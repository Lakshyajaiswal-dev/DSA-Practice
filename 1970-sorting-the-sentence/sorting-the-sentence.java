class Solution {
    public String sortSentence(String s) {
        String [] words = s.split(" ");
        String [] res = new String[words.length];
        for(int i=0; i<words.length; i++){
            String word = words[i];
            int index = word.charAt(word.length()-1)-'1';
            String clean = word.substring(0, word.length()-1);
            res[index]=clean;
        }
        return String.join(" ",res);
    }
}