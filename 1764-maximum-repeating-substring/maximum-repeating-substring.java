class Solution {
    public int maxRepeating(String s, String w) {
       StringBuilder sb = new StringBuilder(s);
       int count=0;
       String rep = w;
       while(s.contains(rep)){
        count++;
        rep+=w;
       }
       return count;
    
    }
}