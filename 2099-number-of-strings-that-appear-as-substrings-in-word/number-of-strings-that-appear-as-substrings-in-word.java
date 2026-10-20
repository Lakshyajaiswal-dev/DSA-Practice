class Solution {
    public int numOfStrings(String[] pa, String word) {
        int count=0;;
        for(int i=0; i<pa.length;i++){
           if(word.contains(pa[i])){
            count++;
           }
        }
        return count;
    }
}