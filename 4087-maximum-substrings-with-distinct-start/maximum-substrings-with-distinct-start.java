class Solution {
    public int maxDistinct(String s) {
        boolean seen [] = new boolean [26];
        int count=0;
        for(int i=0; i<s.length(); i++){
            int ind = s.charAt(i)-'a';
            if(!seen[ind]){
                seen[ind]=true; 
                count++;
            }
        }
        return count;
    }
}