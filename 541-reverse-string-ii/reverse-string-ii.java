class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s.length());
        for(int start=0; start<s.length(); start+=2*k){
        int revEnd = Math.min(start+k-1, s.length()-1);
            for(int i=revEnd; i>=start; i--){
                sb.append(s.charAt(i));
            }
            int normalEnd = Math.min(start + 2 * k - 1, s.length() - 1);
             for (int i = start + k; i <= normalEnd; i++) {
             sb.append(s.charAt(i));
            }
        }
        return sb.toString();

        }
    }
