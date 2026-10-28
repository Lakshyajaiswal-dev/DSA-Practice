class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) {
            return ans;
        }
        int n = p.length() - 1; 
        int start = 0;
        int matched = 0;
        Map<Character, Integer> freqP = new HashMap<>();
        for (char ch : p.toCharArray()) {
            freqP.put(ch, freqP.getOrDefault(ch, 0) + 1);
        }
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);

            if (freqP.containsKey(ch)) {
                freqP.put(ch, freqP.get(ch) - 1);
                if (freqP.get(ch) == 0) {
                    matched++;
                }
            }
            if (freqP.size() == matched) {
                ans.add(start);
            }
            if (end >= n) {
                char left = s.charAt(start);
                if (freqP.containsKey(left)) {
                    if (freqP.get(left) == 0) {
                        matched--;
                    }
                    freqP.put(left, freqP.get(left) + 1);
                }
                start++;
            }
        }

        return ans;
    }
}