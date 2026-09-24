class Solution {
    public boolean checkIfPangram(String s) {
        int[] arr = new int[26];
        for(int i =0; i<s.length(); i++){
            int n = s.charAt(i)-'a';  
            arr[n]++;

        }
        for(int i=0; i<arr.length; i++){
            if (arr[i]==0){
                return false;
            }
        }
        return true;
    }
}