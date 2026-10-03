class Solution {
    public int furthestDistanceFromOrigin(String m) {
        int cL = 0;
        int cR = 0;
        int cD = 0;
        for(int i=0; i<m.length(); i++){
             if(m.charAt(i)=='L'){
                cL++;
             }
             else if(m.charAt(i)=='R'){
                cR++;
             }
             else{
                cD++;
             }
        }
        int n = Math.abs(cR-cL);
        return n+cD;
    }
}