class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = Integer.MIN_VALUE;
        int start =0;
        Map<Character, Integer> freq = new HashMap<>();
        for(int end =0; end<s.length(); end++){
            char ch = s.charAt(end);
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
            if(freq.size()!=(end-start+1)){
                char left = s.charAt(start);
                freq.put(left, freq.get(left)-1);
                if(freq.get(left)==0){
                    freq.remove(left);
                }
                start+=1;
            }
            max = Math.max(max, end-start+1);
        }
        return max==Integer.MIN_VALUE? 0 : max;
    }
}