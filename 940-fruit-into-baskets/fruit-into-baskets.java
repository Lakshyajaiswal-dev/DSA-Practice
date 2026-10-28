class Solution {
    public int totalFruit(int[] fruits) {
       int start =0;
       Map<Integer, Integer> freqMap = new HashMap<>();
       int maxLength = 0;
       for(int end=0; end<fruits.length; end++){
        int curr = fruits[end];
        freqMap.put(curr, freqMap.getOrDefault(curr, 0)+1);
        if(freqMap.size()>2){
         int left = fruits[start];
         freqMap.put(left, freqMap.get(left)-1);
         if(freqMap.get(left)==0){
            freqMap.remove(left);
            
         }
         start++;
        }
        maxLength = Math.max(maxLength, end-start+1);
       } 
       return maxLength;
    }
}