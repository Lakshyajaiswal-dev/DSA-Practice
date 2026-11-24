class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> part = new ArrayList<>();
       int n = s.length();
       int start=0;
       int end=0;
       int [] lastOccurence = new int [26];
       for(int i=0; i<s.length();i++){
        char curr = s.charAt(i);
        lastOccurence[curr-'a'] =i;
       }
       for(int i=0; i<s.length();i++){
        char curr = s.charAt(i);
        int lastIndex = lastOccurence[curr-'a'];
        end = Math.max(end, lastIndex);

        if(i==end){
            part.add(end-start+1);
            start= i+1;
        }
       }
       return part;
    }
}