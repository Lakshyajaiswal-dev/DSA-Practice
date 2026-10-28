class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length()-1;
        int start=0;
        int matched =0;
        Map<Character, Integer> freqS1 = new HashMap<>();
        for(char ch : s1.toCharArray()){
            freqS1.put(ch, freqS1.getOrDefault(ch, 0)+1);
        }
        for(int end=0 ; end<s2.length(); end++){
            char ch = s2.charAt(end);
            if(freqS1.containsKey(ch)){
                freqS1.put(ch, freqS1.get(ch)-1);
                if(freqS1.get(ch)==0){
                    matched++;
                }
            }
            if(freqS1.size()==matched){
                return true;
            }
            if(end>=n){
                char left = s2.charAt(start);
                if(freqS1.containsKey(left)){
                    if(freqS1.get(left)==0){
                        matched--;
                    }
                    freqS1.put(left, freqS1.get(left)+1);
                }
                start++;
            }
            
        }
        return false;
    }
}