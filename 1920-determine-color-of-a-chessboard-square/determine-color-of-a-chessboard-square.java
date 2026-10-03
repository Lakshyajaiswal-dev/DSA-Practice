class Solution {
    public boolean squareIsWhite(String c) {
        for(int i=0; i<c.length()-1; i++){
            if((c.charAt(i)%2==0)&&(c.charAt(i+1)%2==0)){
                return false;
            }
             else if((c.charAt(i)%2!=0)&&(c.charAt(i+1)%2!=0)){
                return false;
            }
        }
        return true;
    }
}